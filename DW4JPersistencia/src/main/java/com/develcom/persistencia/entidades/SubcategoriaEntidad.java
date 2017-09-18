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


@Entity
@Table(name = "subcategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubcategoriaEntidad.findAll", query = "SELECT s FROM SubcategoriaEntidad s")
    , @NamedQuery(name = "SubcategoriaEntidad.findByIdSubcategoria", query = "SELECT s FROM SubcategoriaEntidad s WHERE s.idSubcategoria = :idSubcategoria")
    , @NamedQuery(name = "SubcategoriaEntidad.findBySubcategoria", query = "SELECT s FROM SubcategoriaEntidad s WHERE s.subcategoria = :subcategoria")})
public class SubcategoriaEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_subcategoria")
    private Integer idSubcategoria;
    @Basic(optional = false)
    @Column(name = "subcategoria")
    private String subcategoria;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaEntidad categoriaEntidad;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstatusEntidad estatusEntidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subcategoriaEntidad", fetch = FetchType.LAZY)
    private List<TipodocumentoEntidad> tipodocumentoEntidadList;

    public SubcategoriaEntidad() {
    }

    public SubcategoriaEntidad(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public SubcategoriaEntidad(Integer idSubcategoria, String subcategoria) {
        this.idSubcategoria = idSubcategoria;
        this.subcategoria = subcategoria;
    }

    public Integer getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(Integer idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
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

    @XmlTransient
    public List<TipodocumentoEntidad> getTipodocumentoEntidadList() {
        return tipodocumentoEntidadList;
    }

    public void setTipodocumentoEntidadList(List<TipodocumentoEntidad> tipodocumentoEntidadList) {
        this.tipodocumentoEntidadList = tipodocumentoEntidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubcategoria != null ? idSubcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubcategoriaEntidad)) {
            return false;
        }
        SubcategoriaEntidad other = (SubcategoriaEntidad) object;
        if ((this.idSubcategoria == null && other.idSubcategoria != null) || (this.idSubcategoria != null && !this.idSubcategoria.equals(other.idSubcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.develcom.persistencia.entidades.SubcategoriaEntidad[ idSubcategoria=" + idSubcategoria + " ]";
    }
    
}
