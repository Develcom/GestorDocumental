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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "fabrica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FabricaEntidad.findAll", query = "SELECT f FROM FabricaEntidad f")
    , @NamedQuery(name = "FabricaEntidad.findByUsuario", query = "SELECT f FROM FabricaEntidad f WHERE f.usuario = :usuario")
    , @NamedQuery(name = "FabricaEntidad.findByFabrica", query = "SELECT f FROM FabricaEntidad f WHERE f.fabrica = :fabrica")})
public class FabricaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "fabrica")
    private Character fabrica;
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private UsuarioEntidad usuarioEntidad;

    public FabricaEntidad() {
    }

    public FabricaEntidad(String usuario) {
        this.usuario = usuario;
    }

    public FabricaEntidad(String usuario, Character fabrica) {
        this.usuario = usuario;
        this.fabrica = fabrica;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getFabrica() {
        return fabrica;
    }

    public void setFabrica(Character fabrica) {
        this.fabrica = fabrica;
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
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FabricaEntidad)) {
            return false;
        }
        FabricaEntidad other = (FabricaEntidad) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.FabricaEntidad[ usuario=" + usuario + " ]";
    }
    
}
