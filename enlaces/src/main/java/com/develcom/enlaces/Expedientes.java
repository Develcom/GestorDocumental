/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author develcom
 */
public class Expedientes extends Mensages implements Serializable {

    private static final long serialVersionUID = 1525022219212073677L;

    private Integer idExpedientes;
    private String expediente;
    private Integer idIndice;
    private String valor;
    private Date fechaIndice;
    private Libreria libreria;
    private Categoria categoria;

    public Integer getIdExpedientes() {
        return idExpedientes;
    }

    public void setIdExpedientes(Integer idExpedientes) {
        this.idExpedientes = idExpedientes;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public Integer getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(Integer idIndice) {
        this.idIndice = idIndice;
    }

//    public Indices getIdIndice() {
//        return idIndice;
//    }
//
//    public void setIdIndice(Indices idIndice) {
//        this.idIndice = idIndice;
//    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getFechaIndice() {
        return fechaIndice;
    }

    public void setFechaIndice(Date fechaIndice) {
        this.fechaIndice = fechaIndice;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria idLibreria) {
        this.libreria = idLibreria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria idCategoria) {
        this.categoria = idCategoria;
    }
}
