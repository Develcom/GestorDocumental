/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "tipodocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipodocumentoEntidad.findAll", query = "SELECT t FROM TipodocumentoEntidad t")
    , @NamedQuery(name = "TipodocumentoEntidad.findByIdDocumento", query = "SELECT t FROM TipodocumentoEntidad t WHERE t.idDocumento = :idDocumento")
    , @NamedQuery(name = "TipodocumentoEntidad.findByTipoDocumento", query = "SELECT t FROM TipodocumentoEntidad t WHERE t.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "TipodocumentoEntidad.findByVencimiento", query = "SELECT t FROM TipodocumentoEntidad t WHERE t.vencimiento = :vencimiento")
    , @NamedQuery(name = "TipodocumentoEntidad.findByDatoAdicional", query = "SELECT t FROM TipodocumentoEntidad t WHERE t.datoAdicional = :datoAdicional")
    , @NamedQuery(name = "TipodocumentoEntidad.findByFicha", query = "SELECT t FROM TipodocumentoEntidad t WHERE t.ficha = :ficha")})
public class TipodocumentoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_documento")
    private Integer idDocumento;
    @Basic(optional = false)
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "vencimiento")
    private Character vencimiento;
    @Column(name = "dato_adicional")
    private Character datoAdicional;
    @Column(name = "ficha")
    private Character ficha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodocumentoEntidad", fetch = FetchType.LAZY)
    private List<DatoAdicionalEntidad> datoAdicionalEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodocumentoEntidad", fetch = FetchType.LAZY)
    private List<InfodocumentoEntidad> infodocumentoEntidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipodocumentoEntidad", fetch = FetchType.LAZY)
    private List<FoliaturaEntidad> foliaturaEntidadList;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaEntidad categoriaEntidad;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusEntidad estatusEntidad;
    @JoinColumn(name = "id_subcategoria", referencedColumnName = "id_subcategoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubcategoriaEntidad subcategoriaEntidad;

    public TipodocumentoEntidad() {
    }

    public TipodocumentoEntidad(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public TipodocumentoEntidad(Integer idDocumento, String tipoDocumento) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Character getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Character vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Character getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(Character datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public Character getFicha() {
        return ficha;
    }

    public void setFicha(Character ficha) {
        this.ficha = ficha;
    }

    @XmlTransient
    public List<DatoAdicionalEntidad> getDatoAdicionalEntidadList() {
        return datoAdicionalEntidadList;
    }

    public void setDatoAdicionalEntidadList(List<DatoAdicionalEntidad> datoAdicionalEntidadList) {
        this.datoAdicionalEntidadList = datoAdicionalEntidadList;
    }

    @XmlTransient
    public List<InfodocumentoEntidad> getInfodocumentoEntidadList() {
        return infodocumentoEntidadList;
    }

    public void setInfodocumentoEntidadList(List<InfodocumentoEntidad> infodocumentoEntidadList) {
        this.infodocumentoEntidadList = infodocumentoEntidadList;
    }

    @XmlTransient
    public List<FoliaturaEntidad> getFoliaturaEntidadList() {
        return foliaturaEntidadList;
    }

    public void setFoliaturaEntidadList(List<FoliaturaEntidad> foliaturaEntidadList) {
        this.foliaturaEntidadList = foliaturaEntidadList;
    }

    public CategoriaEntidad getCategoriaEntidad() {
        return categoriaEntidad;
    }

    public void setCategoriaEntidad(CategoriaEntidad categoriaEntidad) {
        this.categoriaEntidad = categoriaEntidad;
    }

    public EstatusEntidad getEstatusEntidad() {
        return estatusEntidad;
    }

    public void setEstatusEntidad(EstatusEntidad estatusEntidad) {
        this.estatusEntidad = estatusEntidad;
    }

    public SubcategoriaEntidad getSubcategoriaEntidad() {
        return subcategoriaEntidad;
    }

    public void setSubcategoriaEntidad(SubcategoriaEntidad subcategoriaEntidad) {
        this.subcategoriaEntidad = subcategoriaEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumento != null ? idDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipodocumentoEntidad)) {
            return false;
        }
        TipodocumentoEntidad other = (TipodocumentoEntidad) object;
        if ((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.TipodocumentoEntidad[ idDocumento=" + idDocumento + " ]";
    }
    
}
