/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author develcom
 */
public class InfoDocumento extends Mensages implements Serializable {

    private static final long serialVersionUID = -247361190927599766L;

    private Integer idInfodocumento;
    private String idExpediente;
    private String nombreArchivo;
    private String rutaArchivo;
    private String formato;
    private int numeroDocumento;
    private int version;
    private int paginas;
    private Date fechaVencimiento;
    private Character reDigitalizado;
    private EstatusDocumento estatusDocumento;
    private TipoDocumento tipoDocumento;
    private List<Foliatura> foliaturas;
    private List<DatosInfoDocumento> datosInfodocumentos;

    public Integer getIdInfodocumento() {
        return idInfodocumento;
    }

    public void setIdInfodocumento(Integer idInfodocumento) {
        this.idInfodocumento = idInfodocumento;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Character getReDigitalizado() {
        return reDigitalizado;
    }

    public void setReDigitalizado(Character reDigitalizado) {
        this.reDigitalizado = reDigitalizado;
    }

    public EstatusDocumento getEstatusDocumento() {
        return estatusDocumento;
    }

    public void setEstatusDocumento(EstatusDocumento estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public List<Foliatura> getFoliaturas() {
        return foliaturas;
    }

    public void setFoliaturas(List<Foliatura> foliaturas) {
        this.foliaturas = foliaturas;
    }

    public List<DatosInfoDocumento> getDatosInfodocumentos() {
        return datosInfodocumentos;
    }

    public void setDatosInfodocumentos(List<DatosInfoDocumento> datosInfodocumentos) {
        this.datosInfodocumentos = datosInfodocumentos;
    }
}
