/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "expedientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExpedientesEntidad.findAll", query = "SELECT e FROM ExpedientesEntidad e")
    , @NamedQuery(name = "ExpedientesEntidad.findByIdExpedientes", query = "SELECT e FROM ExpedientesEntidad e WHERE e.idExpedientes = :idExpedientes")
    , @NamedQuery(name = "ExpedientesEntidad.findByExpediente", query = "SELECT e FROM ExpedientesEntidad e WHERE e.expediente = :expediente")
    , @NamedQuery(name = "ExpedientesEntidad.findByIdIndice", query = "SELECT e FROM ExpedientesEntidad e WHERE e.idIndice = :idIndice")
    , @NamedQuery(name = "ExpedientesEntidad.findByValor", query = "SELECT e FROM ExpedientesEntidad e WHERE e.valor = :valor")
    , @NamedQuery(name = "ExpedientesEntidad.findByFechaIndice", query = "SELECT e FROM ExpedientesEntidad e WHERE e.fechaIndice = :fechaIndice")})
public class ExpedientesEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_expedientes")
    private Integer idExpedientes;
    @Basic(optional = false)
    @Column(name = "expediente")
    private String expediente;
    @Basic(optional = false)
    @Column(name = "id_indice")
    private int idIndice;
    @Column(name = "valor")
    private String valor;
    @Column(name = "fecha_indice")
    @Temporal(TemporalType.DATE)
    private Date fechaIndice;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaEntidad categoriaEntidad;
    @JoinColumn(name = "id_libreria", referencedColumnName = "id_libreria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private LibreriaEntidad libreriaEntidad;

    public ExpedientesEntidad() {
    }

    public ExpedientesEntidad(Integer idExpedientes) {
        this.idExpedientes = idExpedientes;
    }

    public ExpedientesEntidad(Integer idExpedientes, String expediente, int idIndice) {
        this.idExpedientes = idExpedientes;
        this.expediente = expediente;
        this.idIndice = idIndice;
    }

    public Integer getIdExpedientes() {
        return idExpedientes;
    }

    public void setIdExpedientes(Integer idExpedientes) {
        this.idExpedientes = idExpedientes;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public int getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(int idIndice) {
        this.idIndice = idIndice;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getFechaIndice() {
        return fechaIndice;
    }

    public void setFechaIndice(Date fechaIndice) {
        this.fechaIndice = fechaIndice;
    }

    public CategoriaEntidad getCategoriaEntidad() {
        return categoriaEntidad;
    }

    public void setCategoriaEntidad(CategoriaEntidad categoriaEntidad) {
        this.categoriaEntidad = categoriaEntidad;
    }

    public LibreriaEntidad getLibreriaEntidad() {
        return libreriaEntidad;
    }

    public void setLibreriaEntidad(LibreriaEntidad libreriaEntidad) {
        this.libreriaEntidad = libreriaEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExpedientes != null ? idExpedientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpedientesEntidad)) {
            return false;
        }
        ExpedientesEntidad other = (ExpedientesEntidad) object;
        if ((this.idExpedientes == null && other.idExpedientes != null) || (this.idExpedientes != null && !this.idExpedientes.equals(other.idExpedientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.ExpedientesEntidad[ idExpedientes=" + idExpedientes + " ]";
    }
    
}
