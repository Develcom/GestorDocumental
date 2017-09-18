package com.develcom.servicios.herramientas.ldap;

import com.develcom.enlaces.UsuarioLDAP;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:DW4JServicios.properties")
public class ActiveDirectory {

    @Autowired
    private Environment env;

    private final Logger traza = LoggerFactory.getLogger(ActiveDirectory.class);

    private LdapContext conectar(String server, String port, String user, String password, String domain) throws NamingException {

        Properties properties = System.getProperties();
        InitialLdapContext context;

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        properties.put(Context.PROVIDER_URL, "ldap://" + server + ":" + port);
        properties.put(Context.SECURITY_AUTHENTICATION, "simple");
        properties.put(Context.SECURITY_PRINCIPAL, user + "@" + domain);
        properties.put(Context.SECURITY_CREDENTIALS, password);

        context = new InitialLdapContext(properties, null);

        return context;
    }

    public UsuarioLDAP comprobarUsuario(String usuario, String contrasenia) {

        UsuarioLDAP user = null;
        LdapContext context;

        try {
            context = conectar(env.getProperty("server"), env.getProperty("port"), usuario, contrasenia, env.getProperty("dominio"));
            traza.info("LdapContext comprobarUsuario " + context);
            user = buscarDatosUsuario(usuario);

        } catch (NamingException ex) {
            traza.info("Problemas con el usuario", ex);
        }

        return user;
    }

    public UsuarioLDAP buscarDatosUsuario(String usuario) throws NamingException {
        UsuarioLDAP user = null;// = new UsuarioLDAP();
        LdapContext ctx;
        NamingEnumeration answer;
        SearchResult sr;
        Attributes attrs;
        SearchControls searchCtls = new SearchControls();

//        try {
        ctx = conectar(env.getProperty("server"), env.getProperty("port"),
                env.getProperty("user"), env.getProperty("password"), env.getProperty("dominio"));

        traza.info("LdapContext buscarDatosUsuario " + ctx);

        searchCtls.setReturningAttributes(null);
        searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        usuario = "sAMAccountName=" + usuario;
        //usuario = "(&(sn="+ usuario +")"; //"(&(sn=W*)(l=Criteria*))"
        //usuario = "(&(" + usuario + "))";

        answer = ctx.search(env.getProperty("base"), usuario, searchCtls);

        traza.info("respuesta en la busqueda en ldap " + answer);

        if (answer.hasMoreElements()) {
            user = new UsuarioLDAP();
            sr = (SearchResult) answer.next();
            attrs = sr.getAttributes();

//                NamingEnumeration<Attribute> ne = (NamingEnumeration<Attribute>) attrs.getAll();
//                while(ne.hasMore()){
//                    Attribute a = ne.next();
//                    traza.info("id: "+a.getID()+" "+a.get().toString());
//                }
//                traza.info("SearchResult "+sr);
//                traza.info("Attributes "+attrs);
            user.setPass(true);

            if (attrs.get("displayname") != null) {
                user.setNombreCompleto((String) attrs.get("displayname").get());
                traza.info("nombre completo " + attrs.get("displayname").get());
            }

            if (attrs.get("givenName") != null) {
                user.setApellido((String) attrs.get("givenName").get());
                traza.info("nombre " + attrs.get("givenName").get());
            }

            if (attrs.get("sn") != null) {
                user.setNombre((String) attrs.get("sn").get());
                traza.info("apellido " + attrs.get("sn").get());
            }

//                if(attrs.get("givenName") != null){
//                    user.setNombre((String)attrs.get("givenName").get());
//                    traza.info("nombre "+attrs.get("givenName").get());
//                }
//                
//                if(attrs.get("sn") != null){
//                    user.setApellido((String)attrs.get("sn").get());
//                    traza.info("apellido "+attrs.get("sn").get());
//                }
            if (attrs.get("mail") != null) {
                user.setCorreo((String) attrs.get("mail").get());
                traza.info("correo " + attrs.get("mail").get());
            }

            if (attrs.get("telephoneNumber") != null) {
                user.setTelefono((String) attrs.get("telephoneNumber").get());
                traza.info("telefono " + attrs.get("telephoneNumber").get());
            }

            if (attrs.get("description") != null) {
                user.setCargo((String) attrs.get("description").get());
                traza.info("cargo " + attrs.get("description").get());
            }

            if (attrs.get("physicaldeliveryofficename") != null) {
                user.setUbicacion((String) attrs.get("physicaldeliveryofficename").get());
                traza.info("ubicacion " + attrs.get("physicaldeliveryofficename").get());
            }

//                if(attrs.get("socialsecuritynumber") != null) {
//                    user.setCedula((String)attrs.get("socialsecuritynumber").get());
//                    traza.info("cedula socialsecuritynumber "+attrs.get("socialsecuritynumber").get());
//                }
            if (attrs.get("sAMAccountName") != null) {
                user.setLogin((String) attrs.get("sAMAccountName").get());
                traza.info("login " + attrs.get("sAMAccountName").get());
            }

            if (attrs.get("postalCode") != null) {
                user.setCedula((String) attrs.get("postalCode").get());
                traza.info("cedula " + attrs.get("postalCode").get());
            }
//
//                if(attrs.get("nickname") != null) {
//                    user.setLogin((String)attrs.get("nickname").get());
//                    traza.info("login "+attrs.get("nickname").get());
//                }
        }

//        } catch (NamingException ex) {
//            traza.info("problemas al conectarse al directorio activo", Level.ERROR, ex);
//        }
        return user;
    }
}
