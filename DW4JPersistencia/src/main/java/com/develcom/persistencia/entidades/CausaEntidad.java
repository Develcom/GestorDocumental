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
@Table(name = "causa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CausaEntidad.findAll", query = "SELECT c FROM CausaEntidad c")
    , @NamedQuery(name = "CausaEntidad.findByIdCausa", query = "SELECT c FROM CausaEntidad c WHERE c.idCausa = :idCausa")
    , @NamedQuery(name = "CausaEntidad.findByCausa", query = "SELECT c FROM CausaEntidad c WHERE c.causa = :causa")})
public class CausaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_causa")
    private Integer idCausa;
    @Basic(optional = false)
    @Column(name = "causa")
    private String causa;

    public CausaEntidad() {
    }

    public CausaEntidad(Integer idCausa) {
        this.idCausa = idCausa;
    }

    public CausaEntidad(Integer idCausa, String causa) {
        this.idCausa = idCausa;
        this.causa = causa;
    }

    public Integer getIdCausa() {
        return idCausa;
    }

    public void setIdCausa(Integer idCausa) {
        this.idCausa = idCausa;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCausa != null ? idCausa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CausaEntidad)) {
            return false;
        }
        CausaEntidad other = (CausaEntidad) object;
        if ((this.idCausa == null && other.idCausa != null) || (this.idCausa != null && !this.idCausa.equals(other.idCausa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.CausaEntidad[ idCausa=" + idCausa + " ]";
    }
    
}
