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
@Table(name = "dato_adicional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatoAdicionalEntidad.findAll", query = "SELECT d FROM DatoAdicionalEntidad d")
    , @NamedQuery(name = "DatoAdicionalEntidad.findByIdDatoAdicional", query = "SELECT d FROM DatoAdicionalEntidad d WHERE d.idDatoAdicional = :idDatoAdicional")
    , @NamedQuery(name = "DatoAdicionalEntidad.findByIndiceAdicional", query = "SELECT d FROM DatoAdicionalEntidad d WHERE d.indiceAdicional = :indiceAdicional")
    , @NamedQuery(name = "DatoAdicionalEntidad.findByTipo", query = "SELECT d FROM DatoAdicionalEntidad d WHERE d.tipo = :tipo")
    , @NamedQuery(name = "DatoAdicionalEntidad.findByCodigo", query = "SELECT d FROM DatoAdicionalEntidad d WHERE d.codigo = :codigo")})
public class DatoAdicionalEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_dato_adicional")
    private Integer idDatoAdicional;
    @Basic(optional = false)
    @Column(name = "indice_adicional")
    private String indiceAdicional;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "codigo")
    private Integer codigo;
    @JoinColumn(name = "id_documento", referencedColumnName = "id_documento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipodocumentoEntidad tipodocumentoEntidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datoAdicionalEntidad", fetch = FetchType.LAZY)
    private List<ValorDatoAdicionalEntidad> valorDatoAdicionalEntidadList;

    public DatoAdicionalEntidad() {
    }

    public DatoAdicionalEntidad(Integer idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    public DatoAdicionalEntidad(Integer idDatoAdicional, String indiceAdicional, String tipo) {
        this.idDatoAdicional = idDatoAdicional;
        this.indiceAdicional = indiceAdicional;
        this.tipo = tipo;
    }

    public Integer getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(Integer idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    public String getIndiceAdicional() {
        return indiceAdicional;
    }

    public void setIndiceAdicional(String indiceAdicional) {
        this.indiceAdicional = indiceAdicional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public TipodocumentoEntidad getTipodocumentoEntidad() {
        return tipodocumentoEntidad;
    }

    public void setTipodocumentoEntidad(TipodocumentoEntidad tipodocumentoEntidad) {
        this.tipodocumentoEntidad = tipodocumentoEntidad;
    }

    @XmlTransient
    public List<ValorDatoAdicionalEntidad> getValorDatoAdicionalEntidadList() {
        return valorDatoAdicionalEntidadList;
    }

    public void setValorDatoAdicionalEntidadList(List<ValorDatoAdicionalEntidad> valorDatoAdicionalEntidadList) {
        this.valorDatoAdicionalEntidadList = valorDatoAdicionalEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatoAdicional != null ? idDatoAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatoAdicionalEntidad)) {
            return false;
        }
        DatoAdicionalEntidad other = (DatoAdicionalEntidad) object;
        if ((this.idDatoAdicional == null && other.idDatoAdicional != null) || (this.idDatoAdicional != null && !this.idDatoAdicional.equals(other.idDatoAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.DatoAdicionalEntidad[ idDatoAdicional=" + idDatoAdicional + " ]";
    }
    
}
