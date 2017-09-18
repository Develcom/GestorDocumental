/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Consultor
 */
@Entity
@Table(name = "infodocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InfodocumentoEntidad.findAll", query = "SELECT i FROM InfodocumentoEntidad i")
    , @NamedQuery(name = "InfodocumentoEntidad.findByIdInfodocumento", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.idInfodocumento = :idInfodocumento")
    , @NamedQuery(name = "InfodocumentoEntidad.findByIdExpediente", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.idExpediente = :idExpediente")
    , @NamedQuery(name = "InfodocumentoEntidad.findByNombreArchivo", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.nombreArchivo = :nombreArchivo")
    , @NamedQuery(name = "InfodocumentoEntidad.findByRutaArchivo", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.rutaArchivo = :rutaArchivo")
    , @NamedQuery(name = "InfodocumentoEntidad.findByFormato", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.formato = :formato")
    , @NamedQuery(name = "InfodocumentoEntidad.findByNumeroDocumento", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.numeroDocumento = :numeroDocumento")
    , @NamedQuery(name = "InfodocumentoEntidad.findByVersion", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.version = :version")
    , @NamedQuery(name = "InfodocumentoEntidad.findByPaginas", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.paginas = :paginas")
    , @NamedQuery(name = "InfodocumentoEntidad.findByFechaVencimiento", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "InfodocumentoEntidad.findByReDigitalizado", query = "SELECT i FROM InfodocumentoEntidad i WHERE i.reDigitalizado = :reDigitalizado")})
public class InfodocumentoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_infodocumento")
    private Integer idInfodocumento;
    @Column(name = "id_expediente")
    private String idExpediente;
    @Column(name = "nombre_archivo")
    private String nombreArchivo;
    @Column(name = "ruta_archivo")
    private String rutaArchivo;
    @Column(name = "formato")
    private String formato;
    @Basic(optional = false)
    @Column(name = "numero_documento")
    private int numeroDocumento;
    @Basic(optional = false)
    @Column(name = "version")
    private int version;
    @Basic(optional = false)
    @Column(name = "paginas")
    private int paginas;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "re_digitalizado")
    private Character reDigitalizado;
    @JoinColumn(name = "estatus_documento", referencedColumnName = "id_estatus_documento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusDocumentoEntidad estatusDocumentoEntidad;
    @JoinColumn(name = "id_documento", referencedColumnName = "id_documento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipodocumentoEntidad tipodocumentoEntidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "infodocumentoEntidad", fetch = FetchType.LAZY)
    private List<FoliaturaEntidad> foliaturaEntidadList;
    @OneToMany(mappedBy = "infodocumentoEntidad", fetch = FetchType.LAZY)
    private List<DatosInfodocumentoEntidad> datosInfodocumentoEntidadList;

    public InfodocumentoEntidad() {
    }

    public InfodocumentoEntidad(Integer idInfodocumento) {
        this.idInfodocumento = idInfodocumento;
    }

    public InfodocumentoEntidad(Integer idInfodocumento, int numeroDocumento, int version, int paginas, Character reDigitalizado) {
        this.idInfodocumento = idInfodocumento;
        this.numeroDocumento = numeroDocumento;
        this.version = version;
        this.paginas = paginas;
        this.reDigitalizado = reDigitalizado;
    }

    public Integer getIdInfodocumento() {
        return idInfodocumento;
    }

    public void setIdInfodocumento(Integer idInfodocumento) {
        this.idInfodocumento = idInfodocumento;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Character getReDigitalizado() {
        return reDigitalizado;
    }

    public void setReDigitalizado(Character reDigitalizado) {
        this.reDigitalizado = reDigitalizado;
    }

    public EstatusDocumentoEntidad getEstatusDocumentoEntidad() {
        return estatusDocumentoEntidad;
    }

    public void setEstatusDocumentoEntidad(EstatusDocumentoEntidad estatusDocumentoEntidad) {
        this.estatusDocumentoEntidad = estatusDocumentoEntidad;
    }

    public TipodocumentoEntidad getTipodocumentoEntidad() {
        return tipodocumentoEntidad;
    }

    public void setTipodocumentoEntidad(TipodocumentoEntidad tipodocumentoEntidad) {
        this.tipodocumentoEntidad = tipodocumentoEntidad;
    }

    @XmlTransient
    public List<FoliaturaEntidad> getFoliaturaEntidadList() {
        return foliaturaEntidadList;
    }

    public void setFoliaturaEntidadList(List<FoliaturaEntidad> foliaturaEntidadList) {
        this.foliaturaEntidadList = foliaturaEntidadList;
    }

    @XmlTransient
    public List<DatosInfodocumentoEntidad> getDatosInfodocumentoEntidadList() {
        return datosInfodocumentoEntidadList;
    }

    public void setDatosInfodocumentoEntidadList(List<DatosInfodocumentoEntidad> datosInfodocumentoEntidadList) {
        this.datosInfodocumentoEntidadList = datosInfodocumentoEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInfodocumento != null ? idInfodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfodocumentoEntidad)) {
            return false;
        }
        InfodocumentoEntidad other = (InfodocumentoEntidad) object;
        if ((this.idInfodocumento == null && other.idInfodocumento != null) || (this.idInfodocumento != null && !this.idInfodocumento.equals(other.idInfodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.InfodocumentoEntidad[ idInfodocumento=" + idInfodocumento + " ]";
    }
    
}
