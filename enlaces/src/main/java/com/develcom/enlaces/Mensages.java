/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

/**
 *
 * @author familia
 */
public class Mensages {

    private String mensage;
    private String modulo;
    private DW4JExcepcion dw4jException;

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public DW4JExcepcion getDw4jException() {
        return dw4jException;
    }

    public void setDw4jException(DW4JExcepcion dw4jException) {
        this.dw4jException = dw4jException;
    }
}
