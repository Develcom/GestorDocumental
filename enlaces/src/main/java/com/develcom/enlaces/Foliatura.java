/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.io.Serializable;

/**
 *
 * @author familia
 */
public class Foliatura extends Mensages implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Integer idFoliatura;
    private String idExpediente;
    private int pagina;
    private InfoDocumento infoDocumento;
    private TipoDocumento tipoDocumento;

    public Integer getIdFoliatura() {
        return idFoliatura;
    }

    public void setIdFoliatura(Integer idFoliatura) {
        this.idFoliatura = idFoliatura;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public InfoDocumento getInfoDocumento() {
        return infoDocumento;
    }

    public void setInfoDocumento(InfoDocumento infoDocumento) {
        this.infoDocumento = infoDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
