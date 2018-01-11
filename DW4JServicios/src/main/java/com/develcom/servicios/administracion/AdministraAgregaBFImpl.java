/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.servicios.administracion;

import com.develcom.enlaces.DW4JExcepcion;
import com.develcom.enlaces.Perfil;
import com.develcom.enlaces.UsuarioLDAP;
import com.develcom.persistencia.entidades.ConfiguracionEntidad;
import com.develcom.persistencia.entidades.FabricaEntidad;
import com.develcom.persistencia.entidades.PerfilEntidad;
import com.develcom.persistencia.entidades.UsuarioEntidad;
import com.develcom.persistencia.repositorios.ConfiguracionRepositorio;
import com.develcom.persistencia.repositorios.FabricaRepositorio;
import com.develcom.persistencia.repositorios.PerfilRepositorio;
import com.develcom.persistencia.repositorios.UsuarioRepositorio;
import com.develcom.servicios.herramientas.ldap.ActiveDirectory;
import com.develcom.servicios.mapper.MapperBoEntity;
import java.util.List;
import javax.naming.NamingException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author eescalona
 */
public class AdministraAgregaBFImpl implements AdministraAgregaBF {

    private final org.slf4j.Logger LOG = LoggerFactory.getLogger(AdministraAgregaBF.class);

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PerfilRepositorio perfilRepositorio;

    @Autowired
    private ConfiguracionRepositorio configuracionRepositorio;

    @Autowired
    private FabricaRepositorio fabricaRepositorio;

    @Autowired
    private MapperBoEntity mapper;

    @Override
    public boolean agregarPerfil(List<Perfil> perfil) throws DW4JExcepcion, NamingException {

        String usuario;
        UsuarioLDAP userLDAP;
        UsuarioEntidad usuarioEntidad = new UsuarioEntidad();
        List<PerfilEntidad> pes;
        ConfiguracionEntidad configuracionEntidad;
        FabricaEntidad fabricaEntidad;

        usuario = perfil.get(0).getUsuario().getIdUsuario();
        userLDAP = new ActiveDirectory().buscarDatosUsuario(usuario);

        if (userLDAP != null) {

            usuarioEntidad.setIdUsuario(userLDAP.getLogin());
            usuarioEntidad.setNombre(userLDAP.getNombre());
            usuarioEntidad.setApellido(userLDAP.getApellido());
            usuarioEntidad.setCedula(userLDAP.getCedula());
            usuarioEntidad.setSexo(userLDAP.getSexo());

            usuarioRepositorio.save(usuarioEntidad);

            pes = mapper.perfilesDtoToPerfilesEntidad(perfil);
            
            perfilRepositorio.save(pes);

            configuracionEntidad = configuracionRepositorio.findByIdConfiguracion(1);

            if (configuracionEntidad.getFabrica().charValue() == '1') {
                fabricaEntidad = fabricaRepositorio.findByUsuario(usuario);
                
                if(null != fabricaEntidad.getUsuarioEntidad()){
                    
                }
            }

        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
