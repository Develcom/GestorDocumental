package com.develcom.cliente.sesion;

import com.develcom.cliente.util.Propiedades;
import com.develcom.cliente.util.RecursosExternos;
import com.develcom.cliente.util.SesionGlobal;
import com.develcom.enlaces.Sesion;
import com.develcom.enlaces.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author familia
 */
//@Component
public class IniciaSesion {
    
    @Autowired(required = true)
    private Propiedades propiedades;
    
    @Autowired(required = true)
    private RecursosExternos recursosExternos;// = new RecursosExternos();
    
    private String host;

    public IniciaSesion() {
        Properties prop;
        String ip, port;
        
        //prop = propiedades.configuracionProtocolo(); //propiedades.configuracionProtocolo();
        
        ip = SesionGlobal.getServidor();//prop.getProperty("servidor");
        port = SesionGlobal.getPuerto();//prop.getProperty("puerto");
        host="http://"+ip+":"+port;
    }
    
    

    public List<Usuario> autocomplete() {

        RestTemplate rt = new RestTemplate();
        List<Usuario> usuarios;

        usuarios = Arrays.asList(rt.getForObject(host+"/autentica/autocompletar", Usuario[].class));

        return usuarios;
    }

    public Sesion iniciarSesion(Usuario usuario) {

        RestTemplate rt = new RestTemplate();
        Sesion sesion;

        sesion = rt.postForObject(host+"/autentica/verificarUsuario", usuario, Sesion.class);

        return sesion;
    }
    
    public List<Sesion> armarSesion(Usuario usuario){
        
        RestTemplate rt = new RestTemplate();
        List<Sesion> sesions;

        sesions = Arrays.asList(rt.postForObject(host+"/autentica/crearSesion", usuario, Sesion[].class));

        return sesions;
    }

}
