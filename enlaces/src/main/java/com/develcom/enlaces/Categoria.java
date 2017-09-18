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
public class Categoria extends Mensages implements Serializable {

    private static final long serialVersionUID = -2822420755000006811L;

    private Integer idCategoria;
    private String categoria;
    private Estatus estatus;
    private List<SubCategoria> subcategorias;
    private Libreria libreria;
    private List<TipoDocumento> tipodocumentos;
    private List<Indices> indices;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public List<SubCategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<SubCategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    public List<TipoDocumento> getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(List<TipoDocumento> tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    }

    public List<Indices> getIndices() {
        return indices;
    }

    public void setIndices(List<Indices> indices) {
        this.indices = indices;
    }
}
