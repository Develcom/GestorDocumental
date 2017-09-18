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
@Table(name = "datos_infodocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosInfodocumentoEntidad.findAll", query = "SELECT d FROM DatosInfodocumentoEntidad d")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByIdDatos", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.idDatos = :idDatos")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByFechaDigitalizacion", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.fechaDigitalizacion = :fechaDigitalizacion")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByUsuarioDigitalizo", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.usuarioDigitalizo = :usuarioDigitalizo")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByFechaAprobacion", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.fechaAprobacion = :fechaAprobacion")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByUsuarioAprobacion", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.usuarioAprobacion = :usuarioAprobacion")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByFechaRechazo", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.fechaRechazo = :fechaRechazo")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByUsuarioRechazo", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.usuarioRechazo = :usuarioRechazo")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByMotivoRechazo", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.motivoRechazo = :motivoRechazo")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByCausaRechazo", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.causaRechazo = :causaRechazo")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByFechaEliminado", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.fechaEliminado = :fechaEliminado")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByUsuarioElimino", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.usuarioElimino = :usuarioElimino")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByMotivoElimino", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.motivoElimino = :motivoElimino")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByCausaElimino", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.causaElimino = :causaElimino")
    , @NamedQuery(name = "DatosInfodocumentoEntidad.findByDatoAdicional", query = "SELECT d FROM DatosInfodocumentoEntidad d WHERE d.datoAdicional = :datoAdicional")})
public class DatosInfodocumentoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos")
    private Integer idDatos;
    @Column(name = "fecha_digitalizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDigitalizacion;
    @Column(name = "usuario_digitalizo")
    private String usuarioDigitalizo;
    @Column(name = "fecha_aprobacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAprobacion;
    @Column(name = "usuario_aprobacion")
    private String usuarioAprobacion;
    @Column(name = "fecha_rechazo")
    @Temporal(TemporalType.DATE)
    private Date fechaRechazo;
    @Column(name = "usuario_rechazo")
    private String usuarioRechazo;
    @Column(name = "motivo_rechazo")
    private String motivoRechazo;
    @Column(name = "causa_rechazo")
    private String causaRechazo;
    @Column(name = "fecha_eliminado")
    @Temporal(TemporalType.DATE)
    private Date fechaEliminado;
    @Column(name = "usuario_elimino")
    private String usuarioElimino;
    @Column(name = "motivo_elimino")
    private String motivoElimino;
    @Column(name = "causa_elimino")
    private String causaElimino;
    @Column(name = "dato_adicional")
    private String datoAdicional;
    @JoinColumn(name = "id_doc_eliminado", referencedColumnName = "id_doc_eliminado")
    @ManyToOne(fetch = FetchType.LAZY)
    private DocumentoEliminadoEntidad documentoEliminadoEntidad;
    @JoinColumn(name = "id_infodocumento", referencedColumnName = "id_infodocumento")
    @ManyToOne(fetch = FetchType.LAZY)
    private InfodocumentoEntidad infodocumentoEntidad;

    public DatosInfodocumentoEntidad() {
    }

    public DatosInfodocumentoEntidad(Integer idDatos) {
        this.idDatos = idDatos;
    }

    public Integer getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(Integer idDatos) {
        this.idDatos = idDatos;
    }

    public Date getFechaDigitalizacion() {
        return fechaDigitalizacion;
    }

    public void setFechaDigitalizacion(Date fechaDigitalizacion) {
        this.fechaDigitalizacion = fechaDigitalizacion;
    }

    public String getUsuarioDigitalizo() {
        return usuarioDigitalizo;
    }

    public void setUsuarioDigitalizo(String usuarioDigitalizo) {
        this.usuarioDigitalizo = usuarioDigitalizo;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getUsuarioAprobacion() {
        return usuarioAprobacion;
    }

    public void setUsuarioAprobacion(String usuarioAprobacion) {
        this.usuarioAprobacion = usuarioAprobacion;
    }

    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    public String getUsuarioRechazo() {
        return usuarioRechazo;
    }

    public void setUsuarioRechazo(String usuarioRechazo) {
        this.usuarioRechazo = usuarioRechazo;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public String getCausaRechazo() {
        return causaRechazo;
    }

    public void setCausaRechazo(String causaRechazo) {
        this.causaRechazo = causaRechazo;
    }

    public Date getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(Date fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    public String getUsuarioElimino() {
        return usuarioElimino;
    }

    public void setUsuarioElimino(String usuarioElimino) {
        this.usuarioElimino = usuarioElimino;
    }

    public String getMotivoElimino() {
        return motivoElimino;
    }

    public void setMotivoElimino(String motivoElimino) {
        this.motivoElimino = motivoElimino;
    }

    public String getCausaElimino() {
        return causaElimino;
    }

    public void setCausaElimino(String causaElimino) {
        this.causaElimino = causaElimino;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public DocumentoEliminadoEntidad getDocumentoEliminadoEntidad() {
        return documentoEliminadoEntidad;
    }

    public void setDocumentoEliminadoEntidad(DocumentoEliminadoEntidad documentoEliminadoEntidad) {
        this.documentoEliminadoEntidad = documentoEliminadoEntidad;
    }

    public InfodocumentoEntidad getInfodocumentoEntidad() {
        return infodocumentoEntidad;
    }

    public void setInfodocumentoEntidad(InfodocumentoEntidad infodocumentoEntidad) {
        this.infodocumentoEntidad = infodocumentoEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatos != null ? idDatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosInfodocumentoEntidad)) {
            return false;
        }
        DatosInfodocumentoEntidad other = (DatosInfodocumentoEntidad) object;
        if ((this.idDatos == null && other.idDatos != null) || (this.idDatos != null && !this.idDatos.equals(other.idDatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.DatosInfodocumentoEntidad[ idDatos=" + idDatos + " ]";
    }
    
}
