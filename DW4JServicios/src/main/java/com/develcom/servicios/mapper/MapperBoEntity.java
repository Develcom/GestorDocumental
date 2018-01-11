
package com.develcom.servicios.mapper;

import com.develcom.enlaces.Categoria;
import com.develcom.enlaces.DatoAdicional;
import com.develcom.enlaces.DatosInfoDocumento;
import com.develcom.enlaces.DocumentoEliminado;
import com.develcom.enlaces.Estatus;
import com.develcom.enlaces.EstatusDocumento;
import com.develcom.enlaces.Expedientes;
import com.develcom.enlaces.Fabrica;
import com.develcom.enlaces.Foliatura;
import com.develcom.enlaces.Indices;
import com.develcom.enlaces.InfoDocumento;
import com.develcom.enlaces.Libreria;
import com.develcom.enlaces.Perfil;
import com.develcom.enlaces.Rol;
import com.develcom.enlaces.SubCategoria;
import com.develcom.enlaces.TipoDocumento;
import com.develcom.enlaces.Usuario;
import com.develcom.enlaces.ValorDatoAdicional;
import com.develcom.persistencia.entidades.CategoriaEntidad;
import com.develcom.persistencia.entidades.DatoAdicionalEntidad;
import com.develcom.persistencia.entidades.DatosInfodocumentoEntidad;
import com.develcom.persistencia.entidades.DocumentoEliminadoEntidad;
import com.develcom.persistencia.entidades.EstatusDocumentoEntidad;
import com.develcom.persistencia.entidades.EstatusEntidad;
import com.develcom.persistencia.entidades.ExpedientesEntidad;
import com.develcom.persistencia.entidades.FabricaEntidad;
import com.develcom.persistencia.entidades.FoliaturaEntidad;
import com.develcom.persistencia.entidades.IndicesEntidad;
import com.develcom.persistencia.entidades.InfodocumentoEntidad;
import com.develcom.persistencia.entidades.LibreriaEntidad;
import com.develcom.persistencia.entidades.PerfilEntidad;
import com.develcom.persistencia.entidades.RolEntidad;
import com.develcom.persistencia.entidades.SubcategoriaEntidad;
import com.develcom.persistencia.entidades.TipodocumentoEntidad;
import com.develcom.persistencia.entidades.UsuarioEntidad;
import com.develcom.persistencia.entidades.ValorDatoAdicionalEntidad;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface MapperBoEntity {
    
    
    @Mappings({
        @Mapping(target = "expedientesEntidadList", source = "expedientes"),
        @Mapping(target = "categoriaEntidadList", source = "categorias"),
        @Mapping(target = "perfilEntidadList", source = "perfiles"),
        @Mapping(target = "estatusEntidad", source = "estatus")
    })
    LibreriaEntidad libreriaDtoToLiberiraEntidad(Libreria libreria);
    
    @Mappings({
        @Mapping(target = "expedientesEntidadList", ignore = true),
        @Mapping(target = "libreriaEntidad", source = "libreria"),
        @Mapping(target = "perfilEntidadList", ignore = true),
        @Mapping(target = "indicesEntidadList", source = "indices"),
        @Mapping(target = "subcategoriaEntidadList", source = "subcategorias"),
        @Mapping(target = "tipodocumentoEntidadList", source = "tipodocumentos"),
        @Mapping(target = "estatusEntidad", source = "estatus")
    })
    CategoriaEntidad categoriaDtoToCategoriaEntidad(Categoria categoria);
    
    @Mappings({
        @Mapping(target = "categoriaEntidad", source = "categoria"),
        @Mapping(target = "tipodocumentoEntidadList", source = "tipodocumentos"),
        @Mapping(target = "estatusEntidad", source = "estatus")
    })
    SubcategoriaEntidad subCategoriaDtoToSubCategoriaEntidad(SubCategoria subCategoria);
    
    @Mappings({
        @Mapping(target = "categoriaEntidad", source = "categoria"),
        @Mapping(target = "datoAdicionalEntidadList", source = "datoAdicionales"),
        @Mapping(target = "infodocumentoEntidadList", source = "infodocumentos"),
        @Mapping(target = "foliaturaEntidadList", source = "foliaturas"),
        @Mapping(target = "subcategoriaEntidad", source = "subcategoria"),
        @Mapping(target = "estatusEntidad", source = "estatus")
    })
    TipodocumentoEntidad tipoDocumentoDtoToTipoDocumentoEntidad(TipoDocumento tipoDocumento);
    
    @Mappings({
        @Mapping(target = "categoriaEntidad", source = "categoria"),
        @Mapping(target = "libreriaEntidad", source = "libreria")
    })
    ExpedientesEntidad expedienteDtoToExpedienteEntidad(Expedientes expedientes);
    
    @Mappings({
        @Mapping(target = "fabricaEntidad", source = "fabrica"),
        @Mapping(target = "perfilEntidadList", source = "perfiles"),
        @Mapping(target = "estatusEntidad", source = "estatus")
    })
    UsuarioEntidad usuariodtoToUsuarioEntidad(Usuario usuario);
    
    @Mappings({
        @Mapping(target = "perfilEntidadList", ignore = true)
    })
    RolEntidad rolDtoToRolEntidad(Rol rol);
    
    @Mappings({
        @Mapping(target = "categoriaEntidadList", source = "categorias"),
        @Mapping(target = "libreriaEntidadList", source = "librerias"),
        @Mapping(target = "subcategoriaEntidadList", source = "subCategorias"),
        @Mapping(target = "usuarioEntidadList", source = "usuarios"),
        @Mapping(target = "tipodocumentoEntidadList", source = "tipoDocumentos")
    })
    EstatusEntidad estatusDtoToEstatusEntidad(Estatus estatus);
    
    @Mappings({
        @Mapping(target = "infodocumentoEntidad", source = "infoDocumento"),
        @Mapping(target = "tipodocumentoEntidad", source = "tipoDocumento")
    })
    FoliaturaEntidad foliaturaDtoToFoliaturaEntidad(Foliatura foliatura);
    
    @Mappings({
        @Mapping(target = "estatusDocumentoEntidad", source = "estatusDocumento"),
        @Mapping(target = "tipodocumentoEntidad", source = "tipoDocumento"),
        @Mapping(target = "foliaturaEntidadList", source = "foliaturas"),
        @Mapping(target = "datosInfodocumentoEntidadList", source = "datosInfodocumentos")
    })
    InfodocumentoEntidad infoDocumentoDtoToInfoDocumentoEntidad(InfoDocumento infoDocumento);
    
    @Mappings({
        @Mapping(target = "infodocumentoEntidad", source = "infoDocumento"),
        @Mapping(target = "documentoEliminadoEntidad", source = "documentoEliminado")
    })
    DatosInfodocumentoEntidad datosInfoDocumentoDtoToDatosInfoDocumentoEntidad(DatosInfoDocumento datosInfoDocumento);
    
    @Mappings({
        @Mapping(target = "datosInfodocumentoEntidadList", source = "datosInfodocumentos")
    })
    DocumentoEliminadoEntidad documentoEliminadoDtoToDocumentoEliminadoEntidad(DocumentoEliminado documentoEliminado);
    
    @Mappings({
        @Mapping(target = "datoAdicionalEntidad", source = "datoAdicional")
    })
    ValorDatoAdicionalEntidad valorDatoAdicionaDtoToValorDatoAdicionalEntidad(ValorDatoAdicional valorDatoAdicional);
    
    @Mappings({
        @Mapping(target = "tipodocumentoEntidad", source = "tipoDocumento"),
        @Mapping(target = "valorDatoAdicionalEntidadList", source = "valorDatoAdicionales")
    })
    DatoAdicionalEntidad datoAdicionalDtoToDatoAdicionalEntidad(DatoAdicional datoAdicional);
    
    @Mappings({
        @Mapping(target = "usuario", ignore = true),
        @Mapping(target = "usuarioEntidad", source = "usuario")
    })
    FabricaEntidad fabricaDtoToFabricaEntidad(Fabrica fabrica);
    
    @Mappings({
        @Mapping(target = "categoriaEntidad", source = "categoria")
    })
    IndicesEntidad indiceDtoToIndiceEntidad(Indices indice);
    
    @Mappings({
        @Mapping(target = "infodocumentoEntidadList", source = "infodocumentos")
    })
    EstatusDocumentoEntidad estatusDocumentoDtoToEstatusDocumentoEntidad(EstatusDocumento estatusDocumento);
    
    
    @Mappings({
        @Mapping(target = "categoriaEntidad", source = "categoria"),
        @Mapping(target = "libreriaEntidad", source = "libreria"),
        @Mapping(target = "rolEntidad", source = "rol"),
        @Mapping(target = "usuarioEntidad", source = "usuario")
    })
    PerfilEntidad perfilDTOToPerfilEntidad(Perfil perfil);
    
    List<PerfilEntidad> perfilesDtoToPerfilesEntidad(List<Perfil> perfiles);
    
    List<IndicesEntidad> indicesDtoToIndicesEntidad(List<Indices> indices);
    
}
