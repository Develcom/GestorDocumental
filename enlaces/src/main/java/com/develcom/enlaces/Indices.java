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
public class Indices extends Mensages implements Serializable {

    private static final long serialVersionUID = 8531069384626004245L;

    private Integer idIndice;
    private String indice;
    private String tipo;
    private int codigo;
    private Character clave;
    private List<Expedientes> expedientes;
    private Categoria categoria;

    public Integer getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(Integer idIndice) {
        this.idIndice = idIndice;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Character getClave() {
        return clave;
    }

    public void setClave(Character clave) {
        this.clave = clave;
    }

    public List<Expedientes> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(List<Expedientes> expedientes) {
        this.expedientes = expedientes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria idCategoria) {
        this.categoria = idCategoria;
    }
}
