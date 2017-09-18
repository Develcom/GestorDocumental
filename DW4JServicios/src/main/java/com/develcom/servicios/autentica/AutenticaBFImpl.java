package com.develcom.servicios.autentica;

import com.develcom.enlaces.Configuracion;
import com.develcom.enlaces.DW4JExcepcion;
import com.develcom.enlaces.Sesion;
import com.develcom.enlaces.Usuario;
import com.develcom.enlaces.UsuarioLDAP;
import com.develcom.persistencia.entidades.ConfiguracionEntidad;
import com.develcom.persistencia.entidades.UsuarioEntidad;
import com.develcom.persistencia.repositorios.UsuarioRepositorio;
import com.develcom.persistencia.repositorios.ConfiguracionRepositorio;
import com.develcom.servicios.herramientas.Utilitario;
import com.develcom.servicios.herramientas.UtilitarioFecha;
import com.develcom.servicios.herramientas.ldap.ActiveDirectory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.develcom.servicios.mapper.MapperEntityBo;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class AutenticaBFImpl implements AutenticaBF {

    private final Logger LOG = LoggerFactory.getLogger(AutenticaBFImpl.class);

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private ConfiguracionRepositorio configuracionRepositorio;

    @Autowired
    private MapperEntityBo mapper;

    //@Autowired
    //private MapperEntityBo mapperEntityBo = Selma.mapper(MapperEntityBo.class);//mapper(MapperEntityBo.class);
//    private MapperBuilder<MapperEntityBo> mapperEntityBo = Selma.builder(MapperEntityBo.class);
    
    @Override
    public Sesion verificarUsuario(String idUsuario, String password) throws DW4JExcepcion {

        Sesion sesion = new Sesion();
        UsuarioEntidad usuarioEntidad;
        ConfiguracionEntidad configuracionEntidad;
        Usuario user;
        Configuracion configuracion;
        String passDecode = "";
        UsuarioLDAP userLDAP;

        if ("dw4jconf".equalsIgnoreCase(idUsuario) || "dw4jdemo".equalsIgnoreCase(idUsuario)) {

            usuarioEntidad = usuarioRepositorio.findByIdUsuarioAndPassword(idUsuario, password);
            configuracionEntidad = configuracionRepositorio.findOne(1l);

            if (usuarioEntidad.getPassword().equalsIgnoreCase(usuarioEntidad.getPassword())) {

                user = mapper.usuarioEntidadToUsuarioDTO(usuarioEntidad);
                configuracion = mapper.configuracionEntidadToConfiguracionDTO(configuracionEntidad);

//                user = mapperEntityBo.build().entityToBoU(usuarioEntidad);
//                configuracion = mapperEntityBo.build().entityToBo(configuracionEntidad);

                sesion.setUsuario(user);
                sesion.setConfiguracion(configuracion);
            }
        } else {

            userLDAP = new ActiveDirectory().comprobarUsuario(idUsuario, password);

            if (userLDAP != null) {

                if ((userLDAP.getLogin().equalsIgnoreCase(idUsuario)) && (userLDAP.isPass())) {

                    usuarioEntidad = usuarioRepositorio.findByIdUsuarioAndPassword(idUsuario, password);
                    configuracionEntidad = configuracionRepositorio.findOne(1l);

                    user = mapper.usuarioEntidadToUsuarioDTO(usuarioEntidad);
                    configuracion = mapper.configuracionEntidadToConfiguracionDTO(configuracionEntidad);

//                    user = mapperEntityBo.build().entityToBoU(usuarioEntidad);
//                    configuracion = mapperEntityBo.build().entityToBo(configuracionEntidad);

                    sesion.setUsuario(user);
                    sesion.setConfiguracion(configuracion);

                } else {

                    String u = userLDAP.getLogin();
                    LOG.info("usuario LDAP " + userLDAP.getLogin());
                    if (!u.equalsIgnoreCase(idUsuario)) {
                        LOG.info("Usuario " + idUsuario + " no encontrado en ldap");
                        sesion.setMensage("Usuario: " + idUsuario + " no encontrado en ldap (WS)");
                        sesion.setModulo("autentica/ldap");

                    }
                    if (!userLDAP.isPass()) {
                        LOG.info("La contraseña de usuario " + idUsuario + " es incorrecta");
                        sesion.setMensage("La contraseña de usuario " + idUsuario + " es incorrecta (WS)");
                        sesion.setModulo("autentica/ldap");
                    }
                }
            } else {
                LOG.info("Error generado en la busqueda del usuario: " + idUsuario + " en LDAP ");
                sesion.setMensage("Error generado en la busqueda del usuario: " + idUsuario + " en LDAP ");
                sesion.setDw4jException(new DW4JExcepcion("Error generado en la busqueda del usuario: " + idUsuario + " en LDAP "));
            }
        }

        return sesion;
    }

    @Override
    public List<Usuario> autocompletar() throws DW4JExcepcion {
        List<UsuarioEntidad> usuarioEntidads;
        List<Usuario> usuarios;

        usuarioEntidads = (List<UsuarioEntidad>) usuarioRepositorio.findAll();

        usuarios = mapper.usuariosEntidadesToUsuariosDTO(usuarioEntidads);

//        usuarios = mapperEntityBo.build().entitysToBosU(usuarioEntidads);
        return usuarios;
    }

    @Override
    public Sesion crearSesion(Usuario usuario) throws DW4JExcepcion {

        UsuarioEntidad usuarioEntidad;
        ConfiguracionEntidad configuracionEntidad;
        Usuario user;
        Configuracion configuracion;
        Sesion sesion = new Sesion();
        String idSesion, horaFecha;
        int registro = 1;

        usuarioEntidad = usuarioRepositorio.findByIdUsuario(usuario.getIdUsuario());
        configuracionEntidad = configuracionRepositorio.findOne(1l);

        user = mapper.usuarioEntidadToUsuarioDTO(usuarioEntidad);
        configuracion = mapper.configuracionEntidadToConfiguracionDTO(configuracionEntidad);

//        user = mapperEntityBo.build().entityToBoU(usuarioEntidad);
//        configuracion = mapperEntityBo.build().entityToBo(configuracionEntidad);

        sesion.setFechaHora(new UtilitarioFecha().convertLongDate(System.currentTimeMillis()));
        sesion.setIdSession(buscarIdSesion());
        sesion.setUsuario(user);
        sesion.setConfiguracion(configuracion);

        return sesion;
    }

    private String buscarIdSesion() {
        String resp = "";
        String inputLine;
        String inputText = "";
        BufferedReader in;

        try {

            URL busca = new URL("http://localhost:8080/DW4JServicios/Utilitario");

            in = new BufferedReader(new InputStreamReader(busca.openStream()));

            resp = Utilitario.getIdSesion();

            LOG.info("id de la sesion " + resp);
            while ((inputLine = in.readLine()) != null) {
                inputText = inputText + inputLine;
            }

            LOG.info("El contenido de la URL es: " + inputText);
            in.close();

        } catch (MalformedURLException ex) {
            LOG.error("Error generando el URL (ID Sesion)", ex);
        } catch (IOException ex) {
            LOG.error("Error de comunicacion (ID Sesion)", ex);
        }

        return resp;
    }

}
