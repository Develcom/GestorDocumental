/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;
import java.util.List;


public class DatoAdicional extends Mensages implements Serializable {

    private static final long serialVersionUID = 6652097072996225821L;

    private int idDatoAdicional;
    private String indiceAdicional;
    private String tipo;
    private int codigo;
    private TipoDocumento tipoDocumento;
    private List<ValorDatoAdicional> valorDatoAdicionales;

    public int getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(int idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getIndiceAdicional() {
        return indiceAdicional;
    }

    public void setIndiceAdicional(String indiceAdicional) {
        this.indiceAdicional = indiceAdicional;
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

    public List<ValorDatoAdicional> getValorDatoAdicionales() {
        return valorDatoAdicionales;
    }

    public void setValorDatoAdicionales(List<ValorDatoAdicional> valorDatoAdicionales) {
        this.valorDatoAdicionales = valorDatoAdicionales;
    }
}
