package com.develcom.servicios.herramientas.ldap;

import com.develcom.enlaces.DW4JExcepcion;
import com.develcom.enlaces.UsuarioLDAP;
import com.novell.ldap.LDAPAttribute;
import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPException;
import com.novell.ldap.LDAPSearchResults;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import com.novell.ldap.LDAPAttributeSet;
import java.util.Enumeration;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:resources.properties")
public class LDAP {

    @Autowired
    private Environment env;

    private final Logger traza = LoggerFactory.getLogger(LDAP.class);

    public UsuarioLDAP getUser(String usuario, String pass) throws LDAPException, DW4JExcepcion, UnsupportedEncodingException {

        UsuarioLDAP user = new UsuarioLDAP();
        InputStream ips;
        String searchFilter;
        String searchBase;
        String ext;
        String dominio;
        String file;
        String buscar;
        LDAPAttribute attrs;
        LDAPEntry entry;
        boolean resp;

//        try {
        traza.info("buscando a: " + usuario + " en LDAP");

        searchBase = "cn=" + env.getProperty("user") + "," + env.getProperty("base");
        traza.info("searchBase " + searchBase);

        LDAPConnection lc = new LDAPConnection();

        traza.info("conecion LDAP " + lc);

        try {

            if (lc != null) {
                lc.connect(env.getProperty("server"), Integer.valueOf(env.getProperty("port")));
                lc.bind(LDAPConnection.LDAP_V3, searchBase, env.getProperty("password").getBytes("UTF8"));

                int searchScope = LDAPConnection.SCOPE_BASE;
                searchFilter = "Objectclass=*";

                buscar = "uid=" + usuario + "," + env.getProperty("base");
                traza.info("buscando en ldap " + buscar);
                LDAPSearchResults searchResults = lc.search(buscar,
                        searchScope, searchFilter, null, // return all attributes
                        false); // return attrs and values

                traza.info("LDAPSearchResults " + searchResults);

                if (searchResults == null) {
                    throw new DW4JExcepcion("usuario " + usuario + " no encontrado en LDAP");
                }

                entry = searchResults.next();
                traza.info("LDAPEntry " + entry);

                if (entry != null) {

                    LDAPAttributeSet attributeSet = entry.getAttributeSet();
                    Iterator allAttributes = attributeSet.iterator();

                    while (allAttributes.hasNext()) {
                        LDAPAttribute attribute = (LDAPAttribute) allAttributes.next();
                        String attributeName = attribute.getName();
                        Enumeration allValues = attribute.getStringValues();

                        if (allValues != null) {
                            while (allValues.hasMoreElements()) {
                                String value = (String) allValues.nextElement();
                                traza.info("atributo: " + attributeName + " valor: " + value);
                            }
                        }
                    }

                    if (entry.getAttribute("employeeNumber") != null) {
                        attrs = entry.getAttribute("employeeNumber");
                        user.setCedula(attrs.getStringValue());
                        traza.info("employeeNumber: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("givenname") != null) {
                        attrs = entry.getAttribute("givenname");
                        user.setNombre(attrs.getStringValue());
                        traza.info("nombre: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("mail") != null) {
                        attrs = entry.getAttribute("mail");
                        user.setCorreo(attrs.getStringValue());
                        traza.info("email: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("description") != null) {
                        attrs = entry.getAttribute("description");
                        user.setCargo(attrs.getStringValue());
                        traza.info("cargo: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("sn") != null) {
                        attrs = entry.getAttribute("sn");
                        user.setApellido(attrs.getStringValue());
                        traza.info("apellido: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("socialsecuritynumber") != null) {
                        attrs = entry.getAttribute("socialsecuritynumber");
                        user.setCedula(attrs.getStringValue());
                        traza.info("cedula: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("uid") != null) {
                        attrs = entry.getAttribute("uid");
                        user.setLogin(attrs.getStringValue());
                        traza.info("login: " + attrs.getStringValue());
                    }

                    if (entry.getAttribute("userPassword") != null) {
                        attrs = entry.getAttribute("userPassword");
                        SSHA ssha = SSHA.getInstance();
                        resp = ssha.checkDigest(attrs.getStringValue(), pass);
                        user.setPass(resp);
                        traza.info("contraseña: " + attrs.getStringValue());
                        traza.info("respuesta contraseña comparada: " + resp);

                    }

                } else {
                    user = null;
                    traza.info("objeto user " + user);
                    throw new LDAPException("usuarios " + usuario + " no encontrado en LDAP", LDAPException.INVALID_CREDENTIALS, "");
                }

            } else {
                traza.info("problemas en la coneccion con el servidor LDAP", new DW4JExcepcion("problemas en la coneccion con el servidor LDAP"));
                throw new DW4JExcepcion("problemas en la coneccion con el servidor LDAP");
            }

        } catch (LDAPException el) {
            traza.info("poblemas en la busqueda del usuario " + usuario, el);
            throw new DW4JExcepcion("<html>Usuario " + usuario + " <br/>no encontrado en LDAP<html/>");
        }

        return user;

    }

//    private UsuarioLDAP buscarDatos(String usuario) throws AuthenticationException, Exception{
//        
//        UsuarioLDAP user=null;// = new UsuarioLDAP();
//        Properties prop;
//        String searchFilter;
//        String searchBase;
//        LDAPEntry entry;
//        NamingEnumeration answer;
//        LdapContext ctx;
//        
//        prop = Propiedades.cargar();
//        
//        ctx = getContext(prop.getProperty("server"), prop.getProperty("port"), prop.getProperty("user"), prop.getProperty("password"), prop.getProperty("dominio"));
//        
//        SearchControls searchCtls = new SearchControls();
//        searchCtls.setReturningAttributes(null);
//        searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
//        
//        searchFilter = "sAMAccountName=" + usuario;//"(&(" + usuario + "))";
//        searchBase = prop.getProperty("base");
//        
//        answer = ctx.search(searchBase, searchFilter, searchCtls);
//        
//        if (answer.hasMoreElements()) {
//                
//            SearchResult sr = (SearchResult) answer.next();
//            Attributes attrs = sr.getAttributes();
//            user = new UsuarioLDAP();
//            
//            user.setPass(true);
//            
//            
//            if (attrs.get("sAMAccountName") != null){
//                user.setLogin((String)attrs.get("sAMAccountName").get());
//                traza.info("login "+attrs.get("sAMAccountName").get());
//            }
//
//            if (attrs.get("givenName") != null){
//                user.setNombre((String)attrs.get("givenName").get());
//                traza.info("nombre "+attrs.get("givenName").get());
//            }
//
//            if (attrs.get("sn") != null){
//                user.setApellido((String)attrs.get("sn").get());
//                traza.info("apellido "+attrs.get("sn").get());
//            }
//
//            if (attrs.get("mail") != null) {
//                user.setCorreo((String)attrs.get("mail").get());
//                traza.info("correo "+attrs.get("mail").get());
//            }
//
//            if (attrs.get("displayName") != null) {
//                user.setNombreCompleto((String)attrs.get("displayName").get());
//                traza.info("nombre completo "+attrs.get("displayName").get());
//            }
//            
//        } else {
//            
//            user = null; 
//            traza.info("objeto user " + user);
//        }
//        
//        return user;
//    }
//    
//    
//    public UsuarioLDAP getUsuario(String usuario, String pass){
//        
//        UsuarioLDAP user = null;//new UsuarioLDAP();
//        Properties prop;
//        LdapContext ctx;
//        
//        
//        
//        traza.info("buscando a: " + usuario + " en LDAP");
//        try {
//            prop = Propiedades.cargar();
//            ctx = getContext(prop.getProperty("server"), prop.getProperty("port"), usuario, pass, prop.getProperty("dominio"));
//            user = buscarDatos(usuario);
//            
//            if(user==null){
//                throw new Exception("Usuario sin datos");
//            }
//        
//        } catch (Exception ex) {
//            traza.info("Error en el usuario "+usuarioinfo, ex);
//        }
//        
//        
//        return user;
//        
//    }
//    
//    
//    private LdapContext getContext(String server, String port, String user, String password, String dominio) throws Exception{
//
//        
//
//        traza.info("servidor: "+server);
//        traza.info("puerto: "+port);
//        traza.info("usuario: "+user);
//        traza.info("dominio: "+dominio);
//
//        Properties env = System.getProperties();
//        
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//        env.put(Context.PROVIDER_URL, "ldap://" + server + ":" + port);
//        env.put(Context.SECURITY_AUTHENTICATION, "simple");
//        env.put(Context.SECURITY_PRINCIPAL, user + "@" + dominio);
//        env.put(Context.SECURITY_CREDENTIALS, password);
//        
////        env.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
////        env.put("java.naming.provider.url", "ldap://" + server + ":" + port+"/dc=develcom,dc=com,cd=ve");
////        env.put("java.naming.security.authentication", "simple");
////        env.put("java.naming.security.principal", user + "@" + domain);
////        env.put("java.naming.security.credentials", password);
//
//        return new InitialLdapContext(env, null);
//    }
}
