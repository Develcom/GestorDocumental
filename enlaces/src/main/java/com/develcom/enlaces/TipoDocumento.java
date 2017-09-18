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
public class TipoDocumento extends Mensages implements Serializable {

    private static final long serialVersionUID = -2262850499910203728L;
    private int idDocumento;
    private String tipoDocumento;
    private Categoria categoria;
    private SubCategoria subcategoria;
    private Estatus estatus;
    private String vencimiento;
    private String datoAdicional;
    private String ficha;
    private List<DatoAdicional> datoAdicionales;
    private List<Foliatura> foliaturas;
    private List<InfoDocumento> infodocumentos;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public SubCategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubCategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public List<DatoAdicional> getDatoAdicionales() {
        return datoAdicionales;
    }

    public void setDatoAdicionales(List<DatoAdicional> datoAdicionales) {
        this.datoAdicionales = datoAdicionales;
    }

    public List<Foliatura> getFoliaturas() {
        return foliaturas;
    }

    public void setFoliaturas(List<Foliatura> foliaturas) {
        this.foliaturas = foliaturas;
    }

    public List<InfoDocumento> getInfodocumentos() {
        return infodocumentos;
    }

    public void setInfodocumentos(List<InfoDocumento> infodocumentos) {
        this.infodocumentos = infodocumentos;
    }
}
