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
@Table(name = "estatus_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstatusDocumentoEntidad.findAll", query = "SELECT e FROM EstatusDocumentoEntidad e")
    , @NamedQuery(name = "EstatusDocumentoEntidad.findByIdEstatusDocumento", query = "SELECT e FROM EstatusDocumentoEntidad e WHERE e.idEstatusDocumento = :idEstatusDocumento")
    , @NamedQuery(name = "EstatusDocumentoEntidad.findByEstatusDocumento", query = "SELECT e FROM EstatusDocumentoEntidad e WHERE e.estatusDocumento = :estatusDocumento")})
public class EstatusDocumentoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_estatus_documento")
    private Integer idEstatusDocumento;
    @Basic(optional = false)
    @Column(name = "estatus_documento")
    private String estatusDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusDocumentoEntidad", fetch = FetchType.LAZY)
    private List<InfodocumentoEntidad> infodocumentoEntidadList;

    public EstatusDocumentoEntidad() {
    }

    public EstatusDocumentoEntidad(Integer idEstatusDocumento) {
        this.idEstatusDocumento = idEstatusDocumento;
    }

    public EstatusDocumentoEntidad(Integer idEstatusDocumento, String estatusDocumento) {
        this.idEstatusDocumento = idEstatusDocumento;
        this.estatusDocumento = estatusDocumento;
    }

    public Integer getIdEstatusDocumento() {
        return idEstatusDocumento;
    }

    public void setIdEstatusDocumento(Integer idEstatusDocumento) {
        this.idEstatusDocumento = idEstatusDocumento;
    }

    public String getEstatusDocumento() {
        return estatusDocumento;
    }

    public void setEstatusDocumento(String estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }

    @XmlTransient
    public List<InfodocumentoEntidad> getInfodocumentoEntidadList() {
        return infodocumentoEntidadList;
    }

    public void setInfodocumentoEntidadList(List<InfodocumentoEntidad> infodocumentoEntidadList) {
        this.infodocumentoEntidadList = infodocumentoEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstatusDocumento != null ? idEstatusDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstatusDocumentoEntidad)) {
            return false;
        }
        EstatusDocumentoEntidad other = (EstatusDocumentoEntidad) object;
        if ((this.idEstatusDocumento == null && other.idEstatusDocumento != null) || (this.idEstatusDocumento != null && !this.idEstatusDocumento.equals(other.idEstatusDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.EstatusDocumentoEntidad[ idEstatusDocumento=" + idEstatusDocumento + " ]";
    }
    
}
