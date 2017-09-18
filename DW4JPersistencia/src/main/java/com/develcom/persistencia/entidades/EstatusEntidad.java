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
@Table(name = "estatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstatusEntidad.findAll", query = "SELECT e FROM EstatusEntidad e")
    , @NamedQuery(name = "EstatusEntidad.findByIdEstatus", query = "SELECT e FROM EstatusEntidad e WHERE e.idEstatus = :idEstatus")
    , @NamedQuery(name = "EstatusEntidad.findByEstatus", query = "SELECT e FROM EstatusEntidad e WHERE e.estatus = :estatus")})
public class EstatusEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_estatus")
    private Integer idEstatus;
    @Basic(optional = false)
    @Column(name = "estatus")
    private String estatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusEntidad", fetch = FetchType.LAZY)
    private List<CategoriaEntidad> categoriaEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusEntidad", fetch = FetchType.LAZY)
    private List<LibreriaEntidad> libreriaEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusEntidad", fetch = FetchType.LAZY)
    private List<SubcategoriaEntidad> subcategoriaEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusEntidad", fetch = FetchType.LAZY)
    private List<UsuarioEntidad> usuarioEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusEntidad", fetch = FetchType.LAZY)
    private List<TipodocumentoEntidad> tipodocumentoEntidadList;

    public EstatusEntidad() {
    }

    public EstatusEntidad(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public EstatusEntidad(Integer idEstatus, String estatus) {
        this.idEstatus = idEstatus;
        this.estatus = estatus;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public List<CategoriaEntidad> getCategoriaEntidadList() {
        return categoriaEntidadList;
    }

    public void setCategoriaEntidadList(List<CategoriaEntidad> categoriaEntidadList) {
        this.categoriaEntidadList = categoriaEntidadList;
    }

    @XmlTransient
    public List<LibreriaEntidad> getLibreriaEntidadList() {
        return libreriaEntidadList;
    }

    public void setLibreriaEntidadList(List<LibreriaEntidad> libreriaEntidadList) {
        this.libreriaEntidadList = libreriaEntidadList;
    }

    @XmlTransient
    public List<SubcategoriaEntidad> getSubcategoriaEntidadList() {
        return subcategoriaEntidadList;
    }

    public void setSubcategoriaEntidadList(List<SubcategoriaEntidad> subcategoriaEntidadList) {
        this.subcategoriaEntidadList = subcategoriaEntidadList;
    }

    @XmlTransient
    public List<UsuarioEntidad> getUsuarioEntidadList() {
        return usuarioEntidadList;
    }

    public void setUsuarioEntidadList(List<UsuarioEntidad> usuarioEntidadList) {
        this.usuarioEntidadList = usuarioEntidadList;
    }

    @XmlTransient
    public List<TipodocumentoEntidad> getTipodocumentoEntidadList() {
        return tipodocumentoEntidadList;
    }

    public void setTipodocumentoEntidadList(List<TipodocumentoEntidad> tipodocumentoEntidadList) {
        this.tipodocumentoEntidadList = tipodocumentoEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstatus != null ? idEstatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstatusEntidad)) {
            return false;
        }
        EstatusEntidad other = (EstatusEntidad) object;
        if ((this.idEstatus == null && other.idEstatus != null) || (this.idEstatus != null && !this.idEstatus.equals(other.idEstatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.EstatusEntidad[ idEstatus=" + idEstatus + " ]";
    }
    
}
