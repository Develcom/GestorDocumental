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
@Table(name = "foliatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FoliaturaEntidad.findAll", query = "SELECT f FROM FoliaturaEntidad f")
    , @NamedQuery(name = "FoliaturaEntidad.findByIdFoliatura", query = "SELECT f FROM FoliaturaEntidad f WHERE f.idFoliatura = :idFoliatura")
    , @NamedQuery(name = "FoliaturaEntidad.findByIdExpediente", query = "SELECT f FROM FoliaturaEntidad f WHERE f.idExpediente = :idExpediente")
    , @NamedQuery(name = "FoliaturaEntidad.findByPagina", query = "SELECT f FROM FoliaturaEntidad f WHERE f.pagina = :pagina")})
public class FoliaturaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_foliatura")
    private Integer idFoliatura;
    @Basic(optional = false)
    @Column(name = "id_expediente")
    private String idExpediente;
    @Basic(optional = false)
    @Column(name = "pagina")
    private int pagina;
    @JoinColumn(name = "id_infodocumento", referencedColumnName = "id_infodocumento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private InfodocumentoEntidad infodocumentoEntidad;
    @JoinColumn(name = "id_documento", referencedColumnName = "id_documento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipodocumentoEntidad tipodocumentoEntidad;

    public FoliaturaEntidad() {
    }

    public FoliaturaEntidad(Integer idFoliatura) {
        this.idFoliatura = idFoliatura;
    }

    public FoliaturaEntidad(Integer idFoliatura, String idExpediente, int pagina) {
        this.idFoliatura = idFoliatura;
        this.idExpediente = idExpediente;
        this.pagina = pagina;
    }

    public Integer getIdFoliatura() {
        return idFoliatura;
    }

    public void setIdFoliatura(Integer idFoliatura) {
        this.idFoliatura = idFoliatura;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public InfodocumentoEntidad getInfodocumentoEntidad() {
        return infodocumentoEntidad;
    }

    public void setInfodocumentoEntidad(InfodocumentoEntidad infodocumentoEntidad) {
        this.infodocumentoEntidad = infodocumentoEntidad;
    }

    public TipodocumentoEntidad getTipodocumentoEntidad() {
        return tipodocumentoEntidad;
    }

    public void setTipodocumentoEntidad(TipodocumentoEntidad tipodocumentoEntidad) {
        this.tipodocumentoEntidad = tipodocumentoEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFoliatura != null ? idFoliatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FoliaturaEntidad)) {
            return false;
        }
        FoliaturaEntidad other = (FoliaturaEntidad) object;
        if ((this.idFoliatura == null && other.idFoliatura != null) || (this.idFoliatura != null && !this.idFoliatura.equals(other.idFoliatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.FoliaturaEntidad[ idFoliatura=" + idFoliatura + " ]";
    }
    
}
