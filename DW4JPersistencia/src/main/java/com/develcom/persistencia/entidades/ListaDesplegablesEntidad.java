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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "lista_desplegables")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListaDesplegablesEntidad.findAll", query = "SELECT l FROM ListaDesplegablesEntidad l")
    , @NamedQuery(name = "ListaDesplegablesEntidad.findByIdLista", query = "SELECT l FROM ListaDesplegablesEntidad l WHERE l.idLista = :idLista")
    , @NamedQuery(name = "ListaDesplegablesEntidad.findByCodigoIndice", query = "SELECT l FROM ListaDesplegablesEntidad l WHERE l.codigoIndice = :codigoIndice")
    , @NamedQuery(name = "ListaDesplegablesEntidad.findByDescripcion", query = "SELECT l FROM ListaDesplegablesEntidad l WHERE l.descripcion = :descripcion")})
public class ListaDesplegablesEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lista")
    private Integer idLista;
    @Basic(optional = false)
    @Column(name = "codigo_indice")
    private int codigoIndice;
    @Column(name = "descripcion")
    private String descripcion;

    public ListaDesplegablesEntidad() {
    }

    public ListaDesplegablesEntidad(Integer idLista) {
        this.idLista = idLista;
    }

    public ListaDesplegablesEntidad(Integer idLista, int codigoIndice) {
        this.idLista = idLista;
        this.codigoIndice = codigoIndice;
    }

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public int getCodigoIndice() {
        return codigoIndice;
    }

    public void setCodigoIndice(int codigoIndice) {
        this.codigoIndice = codigoIndice;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLista != null ? idLista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListaDesplegablesEntidad)) {
            return false;
        }
        ListaDesplegablesEntidad other = (ListaDesplegablesEntidad) object;
        if ((this.idLista == null && other.idLista != null) || (this.idLista != null && !this.idLista.equals(other.idLista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.ListaDesplegablesEntidad[ idLista=" + idLista + " ]";
    }
    
}
