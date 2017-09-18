/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author SoaintWin64HP
 */
public class Estatus extends Mensages implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idEstatus;
    private String estatus;
//    private List<Usuario> usuarios;
//    private List<Categoria> categorias;
//    private List<Libreria> librerias;
//    private List<TipoDocumento> tipoDocumentos;
//    private List<SubCategoria> subCategorias;

    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

//    public List<Usuario> getUsuarios() {
//        return usuarios;
//    }
//
//    public void setUsuarios(List<Usuario> usuarios) {
//        this.usuarios = usuarios;
//    }
//
//    public List<Categoria> getCategorias() {
//        return categorias;
//    }
//
//    public void setCategorias(List<Categoria> categorias) {
//        this.categorias = categorias;
//    }
//
//    public List<Libreria> getLibrerias() {
//        return librerias;
//    }
//
//    public void setLibrerias(List<Libreria> librerias) {
//        this.librerias = librerias;
//    }
//
//    public List<TipoDocumento> getTipoDocumentos() {
//        return tipoDocumentos;
//    }
//
//    public void setTipoDocumentos(List<TipoDocumento> tipoDocumentos) {
//        this.tipoDocumentos = tipoDocumentos;
//    }
//
//    public List<SubCategoria> getSubCategorias() {
//        return subCategorias;
//    }
//
//    public void setSubCategorias(List<SubCategoria> subCategorias) {
//        this.subCategorias = subCategorias;
//    }
}
