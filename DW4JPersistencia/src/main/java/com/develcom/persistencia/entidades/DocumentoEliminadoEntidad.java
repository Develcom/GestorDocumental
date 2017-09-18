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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "documento_eliminado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoEliminadoEntidad.findAll", query = "SELECT d FROM DocumentoEliminadoEntidad d")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdDocEliminado", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idDocEliminado = :idDocEliminado")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdExpediente", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idExpediente = :idExpediente")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdLibreria", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idLibreria = :idLibreria")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdCategoria", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idCategoria = :idCategoria")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdSubcategoria", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idSubcategoria = :idSubcategoria")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByIdDocumento", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.idDocumento = :idDocumento")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByNumeroDocumento", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.numeroDocumento = :numeroDocumento")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByVersion", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.version = :version")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByPaginas", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.paginas = :paginas")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByFechaVencimiento", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByFechaEliminado", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.fechaEliminado = :fechaEliminado")
    , @NamedQuery(name = "DocumentoEliminadoEntidad.findByUsuarioElimino", query = "SELECT d FROM DocumentoEliminadoEntidad d WHERE d.usuarioElimino = :usuarioElimino")})
public class DocumentoEliminadoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_doc_eliminado")
    private Integer idDocEliminado;
    @Basic(optional = false)
    @Column(name = "id_expediente")
    private String idExpediente;
    @Basic(optional = false)
    @Column(name = "id_libreria")
    private int idLibreria;
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private int idCategoria;
    @Basic(optional = false)
    @Column(name = "id_subcategoria")
    private int idSubcategoria;
    @Basic(optional = false)
    @Column(name = "id_documento")
    private int idDocumento;
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
    @Column(name = "fecha_eliminado")
    @Temporal(TemporalType.DATE)
    private Date fechaEliminado;
    @Basic(optional = false)
    @Column(name = "usuario_elimino")
    private String usuarioElimino;
    @OneToMany(mappedBy = "documentoEliminadoEntidad", fetch = FetchType.LAZY)
    private List<DatosInfodocumentoEntidad> datosInfodocumentoEntidadList;

    public DocumentoEliminadoEntidad() {
    }

    public DocumentoEliminadoEntidad(Integer idDocEliminado) {
        this.idDocEliminado = idDocEliminado;
    }

    public DocumentoEliminadoEntidad(Integer idDocEliminado, String idExpediente, int idLibreria, int idCategoria, int idSubcategoria, int idDocumento, int numeroDocumento, int version, int paginas, Date fechaEliminado, String usuarioElimino) {
        this.idDocEliminado = idDocEliminado;
        this.idExpediente = idExpediente;
        this.idLibreria = idLibreria;
        this.idCategoria = idCategoria;
        this.idSubcategoria = idSubcategoria;
        this.idDocumento = idDocumento;
        this.numeroDocumento = numeroDocumento;
        this.version = version;
        this.paginas = paginas;
        this.fechaEliminado = fechaEliminado;
        this.usuarioElimino = usuarioElimino;
    }

    public Integer getIdDocEliminado() {
        return idDocEliminado;
    }

    public void setIdDocEliminado(Integer idDocEliminado) {
        this.idDocEliminado = idDocEliminado;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getIdLibreria() {
        return idLibreria;
    }

    public void setIdLibreria(int idLibreria) {
        this.idLibreria = idLibreria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
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

    public Date getFechaEliminado() {
        return fechaEliminado;
    }

    public void setFechaEliminado(Date fechaEliminado) {
        this.fechaEliminado = fechaEliminado;
    }

    public String getUsuarioElimino() {
        return usuarioElimino;
    }

    public void setUsuarioElimino(String usuarioElimino) {
        this.usuarioElimino = usuarioElimino;
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
        hash += (idDocEliminado != null ? idDocEliminado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoEliminadoEntidad)) {
            return false;
        }
        DocumentoEliminadoEntidad other = (DocumentoEliminadoEntidad) object;
        if ((this.idDocEliminado == null && other.idDocEliminado != null) || (this.idDocEliminado != null && !this.idDocEliminado.equals(other.idDocEliminado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.DocumentoEliminadoEntidad[ idDocEliminado=" + idDocEliminado + " ]";
    }
    
}
