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
public class Libreria extends Mensages implements Serializable {

    private static final long serialVersionUID = 2428823359479157938L;

    private String libreria;
    private int idLibreria;
    private Estatus estatus;
    private List<Categoria> categorias;
    private List<Expedientes> expedientes;
    private List<Perfil> perfiles;

    public String getLibreria() {
        return libreria;
    }

    public void setLibreria(String libreria) {
        this.libreria = libreria;
    }

    public int getIdLibreria() {
        return idLibreria;
    }

    public void setIdLibreria(int idLibreria) {
        this.idLibreria = idLibreria;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Expedientes> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expedientes> expedientes) {
        this.expedientes = expedientes;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
}
