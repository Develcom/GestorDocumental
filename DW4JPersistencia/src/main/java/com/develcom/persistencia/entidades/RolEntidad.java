/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolEntidad.findAll", query = "SELECT r FROM RolEntidad r")
    , @NamedQuery(name = "RolEntidad.findByIdRol", query = "SELECT r FROM RolEntidad r WHERE r.idRol = :idRol")
    , @NamedQuery(name = "RolEntidad.findByRol", query = "SELECT r FROM RolEntidad r WHERE r.rol = :rol")})
public class RolEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Integer idRol;
    @Basic(optional = false)
    @Column(name = "rol")
    private String rol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolEntidad", fetch = FetchType.LAZY)
    private List<PerfilEntidad> perfilEntidadList;

    public RolEntidad() {
    }

    public RolEntidad(Integer idRol) {
        this.idRol = idRol;
    }

    public RolEntidad(Integer idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlTransient
    public List<PerfilEntidad> getPerfilEntidadList() {
        return perfilEntidadList;
    }

    public void setPerfilEntidadList(List<PerfilEntidad> perfilEntidadList) {
        this.perfilEntidadList = perfilEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolEntidad)) {
            return false;
        }
        RolEntidad other = (RolEntidad) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.RolEntidad[ idRol=" + idRol + " ]";
    }
    
}
