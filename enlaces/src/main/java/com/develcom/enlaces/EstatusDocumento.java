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
 * @author familia
 */
public class EstatusDocumento extends Mensages implements Serializable{

    private static final long serialVersionUID = -7322920136328038323L;
    
    private Integer idEstatusDocumento;
    private String estatusDocumento;
    private List<InfoDocumento> infodocumentos;

    public Integer getIdEstatusDocumento() {
        return idEstatusDocumento;
    }

    public void setIdEstatusDocumento(Integer idEstatusDocumento) {
        this.idEstatusDocumento = idEstatusDocumento;
    }

    public String getEstatusDocumento() {
        return estatusDocumento;
    }

    public void setEstatusDocumento(String estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }

    public List<InfoDocumento> getInfodocumentos() {
        return infodocumentos;
    }

    public void setInfodocumentos(List<InfoDocumento> infodocumentos) {
        this.infodocumentos = infodocumentos;
    }
}
