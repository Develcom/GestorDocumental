/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;

/**
 *
 * @author familia
 */
public class ValorDatoAdicional extends Mensages implements Serializable{

    private static final long serialVersionUID = 5443259953812806230L;
    
    private Integer idValor;
    private String valor;
    private int numero;
    private int version;
    private String expediente;
    private DatoAdicional datoAdicional;

    public Integer getIdValor() {
        return idValor;
    }

    public void setIdValor(Integer idValor) {
        this.idValor = idValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public DatoAdicional getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(DatoAdicional datoAdicional) {
        this.datoAdicional = datoAdicional;
    }
}
