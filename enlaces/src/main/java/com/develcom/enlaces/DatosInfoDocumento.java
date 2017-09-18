/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author familia
 */
public class DatosInfoDocumento  extends Mensages implements Serializable{

    private static final long serialVersionUID = -1337723251076893878L;
    
    private Integer idDatos;
    private Date fechaDigitalizacion;
    private String usuarioDigitalizo;
    private Date fechaAprobacion;
    private String usuarioAprobacion;
    private Date fechaRechazo;
    private String usuarioRechazo;
    private String motivoRechazo;
    private String causaRechazo;
    private Date fechaEliminado;
    private String usuarioElimino;
    private String motivoElimino;
    private String causaElimino;
    private String datoAdicional;
    private InfoDocumento infoDocumento;
    private DocumentoEliminado documentoEliminado;

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

    public InfoDocumento getInfoDocumento() {
        return infoDocumento;
    }

    public void setInfoDocumento(InfoDocumento infoDocumento) {
        this.infoDocumento = infoDocumento;
    }

    public DocumentoEliminado getDocumentoEliminado() {
        return documentoEliminado;
    }

    public void setDocumentoEliminado(DocumentoEliminado documentoEliminado) {
        this.documentoEliminado = documentoEliminado;
    }
}
