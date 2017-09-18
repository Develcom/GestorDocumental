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
public class Folio extends Mensages implements Serializable {

    private static final long serialVersionUID = -141363346413127059L;

    private int idInfoDocumento;
    private int idDocumento;
    private int idSubCategoria;
    private String expediente;
    private int pagina;
    private Mensages mensages;

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getIdInfoDocumento() {
        return idInfoDocumento;
    }

    public void setIdInfoDocumento(int idInfoDocumento) {
        this.idInfoDocumento = idInfoDocumento;
    }

    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public Mensages getMensages() {
        return mensages;
    }

    public void setMensages(Mensages mensages) {
        this.mensages = mensages;
    }
}
