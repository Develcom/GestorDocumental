/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;

/**
 *
 * @author develcom
 * @param <T>
 */
public class Indice<T> extends Indices implements Serializable {

    private static final long serialVersionUID = -4367658067100782147L;

    T valor;
    boolean updateIndices;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public boolean isUpdateIndices() {
        return updateIndices;
    }

    public void setUpdateIndices(boolean updateIndices) {
        this.updateIndices = updateIndices;
    }

}
