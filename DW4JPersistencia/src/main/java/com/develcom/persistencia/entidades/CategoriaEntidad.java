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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaEntidad.findAll", query = "SELECT c FROM CategoriaEntidad c")
    , @NamedQuery(name = "CategoriaEntidad.findByIdCategoria", query = "SELECT c FROM CategoriaEntidad c WHERE c.idCategoria = :idCategoria")
    , @NamedQuery(name = "CategoriaEntidad.findByCategoria", query = "SELECT c FROM CategoriaEntidad c WHERE c.categoria = :categoria")})
public class CategoriaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaEntidad", fetch = FetchType.LAZY)
    private List<ExpedientesEntidad> expedientesEntidadList;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusEntidad estatusEntidad;
    @JoinColumn(name = "id_libreria", referencedColumnName = "id_libreria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private LibreriaEntidad libreriaEntidad;
    @OneToMany(mappedBy = "categoriaEntidad", fetch = FetchType.LAZY)
    private List<PerfilEntidad> perfilEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaEntidad", fetch = FetchType.LAZY)
    private List<IndicesEntidad> indicesEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaEntidad", fetch = FetchType.LAZY)
    private List<SubcategoriaEntidad> subcategoriaEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaEntidad", fetch = FetchType.LAZY)
    private List<TipodocumentoEntidad> tipodocumentoEntidadList;

    public CategoriaEntidad() {
    }

    public CategoriaEntidad(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public CategoriaEntidad(Integer idCategoria, String categoria) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public List<ExpedientesEntidad> getExpedientesEntidadList() {
        return expedientesEntidadList;
    }

    public void setExpedientesEntidadList(List<ExpedientesEntidad> expedientesEntidadList) {
        this.expedientesEntidadList = expedientesEntidadList;
    }

    public EstatusEntidad getEstatusEntidad() {
        return estatusEntidad;
    }

    public void setEstatusEntidad(EstatusEntidad estatusEntidad) {
        this.estatusEntidad = estatusEntidad;
    }

    public LibreriaEntidad getLibreriaEntidad() {
        return libreriaEntidad;
    }

    public void setLibreriaEntidad(LibreriaEntidad libreriaEntidad) {
        this.libreriaEntidad = libreriaEntidad;
    }

    @XmlTransient
    public List<PerfilEntidad> getPerfilEntidadList() {
        return perfilEntidadList;
    }

    public void setPerfilEntidadList(List<PerfilEntidad> perfilEntidadList) {
        this.perfilEntidadList = perfilEntidadList;
    }

    @XmlTransient
    public List<IndicesEntidad> getIndicesEntidadList() {
        return indicesEntidadList;
    }

    public void setIndicesEntidadList(List<IndicesEntidad> indicesEntidadList) {
        this.indicesEntidadList = indicesEntidadList;
    }

    @XmlTransient
    public List<SubcategoriaEntidad> getSubcategoriaEntidadList() {
        return subcategoriaEntidadList;
    }

    public void setSubcategoriaEntidadList(List<SubcategoriaEntidad> subcategoriaEntidadList) {
        this.subcategoriaEntidadList = subcategoriaEntidadList;
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
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaEntidad)) {
            return false;
        }
        CategoriaEntidad other = (CategoriaEntidad) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.CategoriaEntidad[ idCategoria=" + idCategoria + " ]";
    }
    
}
