/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author develcom
 */
public class Rol extends Mensages implements Serializable {

    private static final long serialVersionUID = -4880432965694793601L;

    private int idRol;
    private String rol;
//    private List<Perfil> perfiles;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

//    public List<Perfil> getPerfiles() {
//        return perfiles;
//    }
//
//    public void setPerfiles(List<Perfil> perfiles) {
//        this.perfiles = perfiles;
//    }
}
