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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "indices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndicesEntidad.findAll", query = "SELECT i FROM IndicesEntidad i")
    , @NamedQuery(name = "IndicesEntidad.findByIdIndice", query = "SELECT i FROM IndicesEntidad i WHERE i.idIndice = :idIndice")
    , @NamedQuery(name = "IndicesEntidad.findByIndice", query = "SELECT i FROM IndicesEntidad i WHERE i.indice = :indice")
    , @NamedQuery(name = "IndicesEntidad.findByTipo", query = "SELECT i FROM IndicesEntidad i WHERE i.tipo = :tipo")
    , @NamedQuery(name = "IndicesEntidad.findByCodigo", query = "SELECT i FROM IndicesEntidad i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "IndicesEntidad.findByClave", query = "SELECT i FROM IndicesEntidad i WHERE i.clave = :clave")})
public class IndicesEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_indice")
    private Integer idIndice;
    @Basic(optional = false)
    @Column(name = "indice")
    private String indice;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "clave")
    private Character clave;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaEntidad categoriaEntidad;

    public IndicesEntidad() {
    }

    public IndicesEntidad(Integer idIndice) {
        this.idIndice = idIndice;
    }

    public IndicesEntidad(Integer idIndice, String indice, String tipo, int codigo) {
        this.idIndice = idIndice;
        this.indice = indice;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public Integer getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(Integer idIndice) {
        this.idIndice = idIndice;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Character getClave() {
        return clave;
    }

    public void setClave(Character clave) {
        this.clave = clave;
    }

    public CategoriaEntidad getCategoriaEntidad() {
        return categoriaEntidad;
    }

    public void setCategoriaEntidad(CategoriaEntidad categoriaEntidad) {
        this.categoriaEntidad = categoriaEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIndice != null ? idIndice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicesEntidad)) {
            return false;
        }
        IndicesEntidad other = (IndicesEntidad) object;
        if ((this.idIndice == null && other.idIndice != null) || (this.idIndice != null && !this.idIndice.equals(other.idIndice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.IndicesEntidad[ idIndice=" + idIndice + " ]";
    }
    
}
