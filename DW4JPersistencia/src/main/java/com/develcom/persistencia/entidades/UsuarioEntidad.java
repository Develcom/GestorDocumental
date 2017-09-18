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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioEntidad.findAll", query = "SELECT u FROM UsuarioEntidad u")
    , @NamedQuery(name = "UsuarioEntidad.findByIdUsuario", query = "SELECT u FROM UsuarioEntidad u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "UsuarioEntidad.findByNombre", query = "SELECT u FROM UsuarioEntidad u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UsuarioEntidad.findByApellido", query = "SELECT u FROM UsuarioEntidad u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "UsuarioEntidad.findByCedula", query = "SELECT u FROM UsuarioEntidad u WHERE u.cedula = :cedula")
    , @NamedQuery(name = "UsuarioEntidad.findBySexo", query = "SELECT u FROM UsuarioEntidad u WHERE u.sexo = :sexo")
    , @NamedQuery(name = "UsuarioEntidad.findByPassword", query = "SELECT u FROM UsuarioEntidad u WHERE u.password = :password")})
public class UsuarioEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioEntidad", fetch = FetchType.LAZY)
    private FabricaEntidad fabricaEntidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioEntidad", fetch = FetchType.LAZY)
    private List<PerfilEntidad> perfilEntidadList;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusEntidad estatusEntidad;

    public UsuarioEntidad() {
    }

    public UsuarioEntidad(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioEntidad(String idUsuario, String nombre, String apellido) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FabricaEntidad getFabricaEntidad() {
        return fabricaEntidad;
    }

    public void setFabricaEntidad(FabricaEntidad fabricaEntidad) {
        this.fabricaEntidad = fabricaEntidad;
    }

    @XmlTransient
    public List<PerfilEntidad> getPerfilEntidadList() {
        return perfilEntidadList;
    }

    public void setPerfilEntidadList(List<PerfilEntidad> perfilEntidadList) {
        this.perfilEntidadList = perfilEntidadList;
    }

    public EstatusEntidad getEstatusEntidad() {
        return estatusEntidad;
    }

    public void setEstatusEntidad(EstatusEntidad estatusEntidad) {
        this.estatusEntidad = estatusEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioEntidad)) {
            return false;
        }
        UsuarioEntidad other = (UsuarioEntidad) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.UsuarioEntidad[ idUsuario=" + idUsuario + " ]";
    }
    
}
