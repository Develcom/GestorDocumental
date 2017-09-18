/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "valor_dato_adicional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ValorDatoAdicionalEntidad.findAll", query = "SELECT v FROM ValorDatoAdicionalEntidad v")
    , @NamedQuery(name = "ValorDatoAdicionalEntidad.findByIdValor", query = "SELECT v FROM ValorDatoAdicionalEntidad v WHERE v.idValor = :idValor")
    , @NamedQuery(name = "ValorDatoAdicionalEntidad.findByValor", query = "SELECT v FROM ValorDatoAdicionalEntidad v WHERE v.valor = :valor")
    , @NamedQuery(name = "ValorDatoAdicionalEntidad.findByNumero", query = "SELECT v FROM ValorDatoAdicionalEntidad v WHERE v.numero = :numero")
    , @NamedQuery(name = "ValorDatoAdicionalEntidad.findByVersion", query = "SELECT v FROM ValorDatoAdicionalEntidad v WHERE v.version = :version")
    , @NamedQuery(name = "ValorDatoAdicionalEntidad.findByExpediente", query = "SELECT v FROM ValorDatoAdicionalEntidad v WHERE v.expediente = :expediente")})
public class ValorDatoAdicionalEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_valor")
    private Integer idValor;
    @Basic(optional = false)
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "expediente")
    private String expediente;
    @JoinColumn(name = "id_dato_adicional", referencedColumnName = "id_dato_adicional")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DatoAdicionalEntidad datoAdicionalEntidad;

    public ValorDatoAdicionalEntidad() {
    }

    public ValorDatoAdicionalEntidad(Integer idValor) {
        this.idValor = idValor;
    }

    public ValorDatoAdicionalEntidad(Integer idValor, String valor, int numero, int version, String expediente) {
        this.idValor = idValor;
        this.valor = valor;
        this.numero = numero;
        this.version = version;
        this.expediente = expediente;
    }

    public Integer getIdValor() {
        return idValor;
    }

    public void setIdValor(Integer idValor) {
        this.idValor = idValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public DatoAdicionalEntidad getDatoAdicionalEntidad() {
        return datoAdicionalEntidad;
    }

    public void setDatoAdicionalEntidad(DatoAdicionalEntidad datoAdicionalEntidad) {
        this.datoAdicionalEntidad = datoAdicionalEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValor != null ? idValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValorDatoAdicionalEntidad)) {
            return false;
        }
        ValorDatoAdicionalEntidad other = (ValorDatoAdicionalEntidad) object;
        if ((this.idValor == null && other.idValor != null) || (this.idValor != null && !this.idValor.equals(other.idValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.ValorDatoAdicionalEntidad[ idValor=" + idValor + " ]";
    }
    
}
