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
public class Fabrica extends Mensages implements Serializable {

    private static final long serialVersionUID = -3919673669390398297L;

    private Character fabrica;
    private Usuario usuario;

    public Character getFabrica() {
        return fabrica;
    }

    public void setFabrica(Character fabrica) {
        this.fabrica = fabrica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
