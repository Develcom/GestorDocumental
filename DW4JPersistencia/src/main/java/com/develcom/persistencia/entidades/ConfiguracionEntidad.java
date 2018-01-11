/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "configuracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionEntidad.findAll", query = "SELECT c FROM ConfiguracionEntidad c")
    , @NamedQuery(name = "ConfiguracionEntidad.findByIdConfiguracion", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.idConfiguracion = :idConfiguracion")
    , @NamedQuery(name = "ConfiguracionEntidad.findByCalidad", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.calidad = :calidad")
    , @NamedQuery(name = "ConfiguracionEntidad.findByRutaTemporal", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.rutaTemporal = :rutaTemporal")
    , @NamedQuery(name = "ConfiguracionEntidad.findByArchivoTif", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.archivoTif = :archivoTif")
    , @NamedQuery(name = "ConfiguracionEntidad.findByArchivoCod", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.archivoCod = :archivoCod")
    , @NamedQuery(name = "ConfiguracionEntidad.findByLog", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.log = :log")
    , @NamedQuery(name = "ConfiguracionEntidad.findByFoliatura", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.foliatura = :foliatura")
    , @NamedQuery(name = "ConfiguracionEntidad.findByServerName", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.serverName = :serverName")
    , @NamedQuery(name = "ConfiguracionEntidad.findByDatabaseName", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.databaseName = :databaseName")
    , @NamedQuery(name = "ConfiguracionEntidad.findByPort", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.port = :port")
    , @NamedQuery(name = "ConfiguracionEntidad.findByUserbd", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.userbd = :userbd")
    , @NamedQuery(name = "ConfiguracionEntidad.findByPassword", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.password = :password")
    , @NamedQuery(name = "ConfiguracionEntidad.findByFicha", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.ficha = :ficha")
    , @NamedQuery(name = "ConfiguracionEntidad.findByFabrica", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.fabrica = :fabrica")
    , @NamedQuery(name = "ConfiguracionEntidad.findByElimina", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.elimina = :elimina")
    , @NamedQuery(name = "ConfiguracionEntidad.findByLdap", query = "SELECT c FROM ConfiguracionEntidad c WHERE c.ldap = :ldap")})
public class ConfiguracionEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_configuracion")
    private Integer idConfiguracion;
    @Column(name = "calidad")
    private Character calidad;
    @Column(name = "ruta_temporal")
    private String rutaTemporal;
    @Column(name = "archivo_tif")
    private String archivoTif;
    @Column(name = "archivo_cod")
    private String archivoCod;
    @Column(name = "log")
    private String log;
    @Column(name = "foliatura")
    private Character foliatura;
    @Column(name = "server_name")
    private String serverName;
    @Column(name = "database_name")
    private String databaseName;
    @Column(name = "port")
    private Integer port;
    @Column(name = "userbd")
    private String userbd;
    @Column(name = "password")
    private String password;
    @Column(name = "ficha")
    private Character ficha;
    @Column(name = "fabrica")
    private Character fabrica;
    @Column(name = "elimina")
    private Character elimina;
    @Column(name = "ldap")
    private Character ldap;

    public ConfiguracionEntidad() {
    }

//    public ConfiguracionEntidad(Integer idConfiguracion) {
//        this.idConfiguracion = idConfiguracion;
//    }

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConfiguracion != null ? idConfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracionEntidad)) {
            return false;
        }
        ConfiguracionEntidad other = (ConfiguracionEntidad) object;
        if ((this.idConfiguracion == null && other.idConfiguracion != null) || (this.idConfiguracion != null && !this.idConfiguracion.equals(other.idConfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.ConfiguracionEntidad[ idConfiguracion=" + idConfiguracion + " ]";
    }
    
}
