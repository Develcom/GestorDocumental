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
@Table(name = "perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilEntidad.findAll", query = "SELECT p FROM PerfilEntidad p")
    , @NamedQuery(name = "PerfilEntidad.findByIdPerfil", query = "SELECT p FROM PerfilEntidad p WHERE p.idPerfil = :idPerfil")})
public class PerfilEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEntidad categoriaEntidad;
    @JoinColumn(name = "id_libreria", referencedColumnName = "id_libreria")
    @ManyToOne(fetch = FetchType.LAZY)
    private LibreriaEntidad libreriaEntidad;
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RolEntidad rolEntidad;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UsuarioEntidad usuarioEntidad;

    public PerfilEntidad() {
    }

    public PerfilEntidad(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
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

    public RolEntidad getRolEntidad() {
        return rolEntidad;
    }

    public void setRolEntidad(RolEntidad rolEntidad) {
        this.rolEntidad = rolEntidad;
    }

    public UsuarioEntidad getUsuarioEntidad() {
        return usuarioEntidad;
    }

    public void setUsuarioEntidad(UsuarioEntidad usuarioEntidad) {
        this.usuarioEntidad = usuarioEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfil != null ? idPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilEntidad)) {
            return false;
        }
        PerfilEntidad other = (PerfilEntidad) object;
        if ((this.idPerfil == null && other.idPerfil != null) || (this.idPerfil != null && !this.idPerfil.equals(other.idPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.PerfilEntidad[ idPerfil=" + idPerfil + " ]";
    }
    
}
