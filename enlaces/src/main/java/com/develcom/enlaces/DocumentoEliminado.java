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
public class DocumentoEliminado extends Mensages implements Serializable {

    private static final long serialVersionUID = -3342378609471095154L;
    private Integer idDocEliminado;
    private String idExpediente;
    private int idLibreria;
    private int idCategoria;
    private int idSubcategoria;
    private int idDocumento;
    private int numeroDocumento;
    private int version;
    private int paginas;
    private Date fechaVencimiento;
    private Date fechaEliminado;
    private String usuarioElimino;
    private List<DatosInfoDocumento> datosInfodocumentos;

    public Integer getIdDocEliminado() {
        return idDocEliminado;
    }

    public void setIdDocEliminado(Integer idDocEliminado) {
        this.idDocEliminado = idDocEliminado;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getIdLibreria() {
        return idLibreria;
    }

    public void setIdLibreria(int idLibreria) {
        this.idLibreria = idLibreria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
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

    public List<DatosInfoDocumento> getDatosInfodocumentos() {
        return datosInfodocumentos;
    }

    public void setDatosInfodocumentos(List<DatosInfoDocumento> datosInfodocumentos) {
        this.datosInfodocumentos = datosInfodocumentos;
    }
}
