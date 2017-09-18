/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;

/**
 *
 * @author develcom
 */
public class Configuracion extends Mensages implements Serializable {

    private static final long serialVersionUID = -4177500139119370004L;

    private Integer idConfiguracion;
    private Character calidad;
    private String rutaTemporal;
    private String archivoTif;
    private String archivoCod;
    private String log;
    private Character foliatura;
    private String serverName;
    private String databaseName;
    private Integer port;
    private String userbd;
    private String password;
    private Character ficha;
    private Character fabrica;
    private Character elimina;
    private Character ldap;

    public Integer getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public Character getCalidad() {
        return calidad;
    }

    public void setCalidad(Character calidad) {
        this.calidad = calidad;
    }

    public String getRutaTemporal() {
        return rutaTemporal;
    }

    public void setRutaTemporal(String rutaTemporal) {
        this.rutaTemporal = rutaTemporal;
    }

    public String getArchivoTif() {
        return archivoTif;
    }

    public void setArchivoTif(String archivoTif) {
        this.archivoTif = archivoTif;
    }

    public String getArchivoCod() {
        return archivoCod;
    }

    public void setArchivoCod(String archivoCod) {
        this.archivoCod = archivoCod;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Character getFoliatura() {
        return foliatura;
    }

    public void setFoliatura(Character foliatura) {
        this.foliatura = foliatura;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserbd() {
        return userbd;
    }

    public void setUserbd(String userbd) {
        this.userbd = userbd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getFicha() {
        return ficha;
    }

    public void setFicha(Character ficha) {
        this.ficha = ficha;
    }

    public Character getFabrica() {
        return fabrica;
    }

    public void setFabrica(Character fabrica) {
        this.fabrica = fabrica;
    }

    public Character getElimina() {
        return elimina;
    }

    public void setElimina(Character elimina) {
        this.elimina = elimina;
    }

    public Character getLdap() {
        return ldap;
    }

    public void setLdap(Character ldap) {
        this.ldap = ldap;
    }
}
