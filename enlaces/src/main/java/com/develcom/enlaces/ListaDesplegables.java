/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;

/**
 *
 * @author develcom
 */
public class ListaDesplegables extends Mensages implements Serializable {

    private static final long serialVersionUID = -9015899178987510482L;

    int idLista;
    int codigoIndice;
    String descripcion;

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public int getCodigoIndice() {
        return codigoIndice;
    }

    public void setCodigoIndice(int codigoIndice) {
        this.codigoIndice = codigoIndice;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
