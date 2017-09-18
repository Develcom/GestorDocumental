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
@Table(name = "libreria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibreriaEntidad.findAll", query = "SELECT l FROM LibreriaEntidad l")
    , @NamedQuery(name = "LibreriaEntidad.findByIdLibreria", query = "SELECT l FROM LibreriaEntidad l WHERE l.idLibreria = :idLibreria")
    , @NamedQuery(name = "LibreriaEntidad.findByLibreria", query = "SELECT l FROM LibreriaEntidad l WHERE l.libreria = :libreria")})
public class LibreriaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libreria")
    private Integer idLibreria;
    @Basic(optional = false)
    @Column(name = "libreria")
    private String libreria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libreriaEntidad", fetch = FetchType.LAZY)
    private List<ExpedientesEntidad> expedientesEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libreriaEntidad", fetch = FetchType.LAZY)
    private List<CategoriaEntidad> categoriaEntidadList;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusEntidad estatusEntidad;
    @OneToMany(mappedBy = "libreriaEntidad", fetch = FetchType.LAZY)
    private List<PerfilEntidad> perfilEntidadList;

    public LibreriaEntidad() {
    }

    public LibreriaEntidad(Integer idLibreria) {
        this.idLibreria = idLibreria;
    }

    public LibreriaEntidad(Integer idLibreria, String libreria) {
        this.idLibreria = idLibreria;
        this.libreria = libreria;
    }

    public Integer getIdLibreria() {
        return idLibreria;
    }

    public void setIdLibreria(Integer idLibreria) {
        this.idLibreria = idLibreria;
    }

    public String getLibreria() {
        return libreria;
    }

    public void setLibreria(String libreria) {
        this.libreria = libreria;
    }

    @XmlTransient
    public List<ExpedientesEntidad> getExpedientesEntidadList() {
        return expedientesEntidadList;
    }

    public void setExpedientesEntidadList(List<ExpedientesEntidad> expedientesEntidadList) {
        this.expedientesEntidadList = expedientesEntidadList;
    }

    @XmlTransient
    public List<CategoriaEntidad> getCategoriaEntidadList() {
        return categoriaEntidadList;
    }

    public void setCategoriaEntidadList(List<CategoriaEntidad> categoriaEntidadList) {
        this.categoriaEntidadList = categoriaEntidadList;
    }

    public EstatusEntidad getEstatusEntidad() {
        return estatusEntidad;
    }

    public void setEstatusEntidad(EstatusEntidad estatusEntidad) {
        this.estatusEntidad = estatusEntidad;
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
        hash += (idLibreria != null ? idLibreria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibreriaEntidad)) {
            return false;
        }
        LibreriaEntidad other = (LibreriaEntidad) object;
        if ((this.idLibreria == null && other.idLibreria != null) || (this.idLibreria != null && !this.idLibreria.equals(other.idLibreria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.LibreriaEntidad[ idLibreria=" + idLibreria + " ]";
    }
    
}
