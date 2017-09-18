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
public class SubCategoria extends Mensages implements Serializable {

    private static final long serialVersionUID = -2386561446106085517L;

    private int idSubcategoria;
    private Categoria categoria;
    private String subcategoria;
    private Estatus estatus;
    private List<TipoDocumento> tipodocumentos;

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public List<TipoDocumento> getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(List<TipoDocumento> tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    }
}
