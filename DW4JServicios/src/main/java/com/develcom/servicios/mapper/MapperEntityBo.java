package com.develcom.servicios.mapper;

import com.develcom.enlaces.Categoria;
import com.develcom.enlaces.Configuracion;
import com.develcom.enlaces.DatoAdicional;
import com.develcom.enlaces.DatosInfoDocumento;
import com.develcom.enlaces.DocumentoEliminado;
import com.develcom.enlaces.Estatus;
import com.develcom.enlaces.EstatusDocumento;
import com.develcom.enlaces.Fabrica;
import com.develcom.enlaces.Foliatura;
import com.develcom.enlaces.Indice;
import com.develcom.enlaces.InfoDocumento;
import com.develcom.enlaces.Libreria;
import com.develcom.enlaces.Perfil;
import com.develcom.enlaces.Rol;
import com.develcom.enlaces.SubCategoria;
import com.develcom.enlaces.TipoDocumento;
import com.develcom.enlaces.Usuario;
import com.develcom.enlaces.ValorDatoAdicional;
import com.develcom.persistencia.entidades.CategoriaEntidad;
import com.develcom.persistencia.entidades.ConfiguracionEntidad;
import com.develcom.persistencia.entidades.DatoAdicionalEntidad;
import com.develcom.persistencia.entidades.DatosInfodocumentoEntidad;
import com.develcom.persistencia.entidades.DocumentoEliminadoEntidad;
import com.develcom.persistencia.entidades.EstatusDocumentoEntidad;
import com.develcom.persistencia.entidades.EstatusEntidad;
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
public interface MapperEntityBo {
    
    
    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    Estatus estatusEntidadToEstatusDTO(EstatusEntidad estatusEntidad);
    
    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "usuario", ignore = true)
    })
    Fabrica fabricaEntidadToFabricaDTO(FabricaEntidad fabricaEntidad);
    
    @Mappings({
        @Mapping(target = "rol", source = "rolEntidad"),
        @Mapping(target = "libreria", source = "libreriaEntidad"),
        @Mapping(target = "categoria", source = "categoriaEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "usuario", ignore = true),
        
        
        @Mapping(target = "categoria.subcategorias", ignore = true),
        @Mapping(target = "categoria.modulo", ignore = true),
        @Mapping(target = "categoria.dw4jException", ignore = true),
        
        
        @Mapping(target = "libreria.modulo", ignore = true),
        @Mapping(target = "libreria.dw4jException", ignore = true),
        
        
        @Mapping(target = "rol.modulo", ignore = true),
        @Mapping(target = "rol.dw4jException", ignore = true),
    })
    Perfil perfilEntidadeToPerfileDTO(PerfilEntidad perfilEntidad, 
            LibreriaEntidad libreriaEntidad, CategoriaEntidad categoriaEntidad, 
            RolEntidad rolEntidad);
    
    @Mappings({
        @Mapping(target = "perfiles", source = "usuarioEntidad.perfilEntidadList"),
        @Mapping(target = "fabrica", source = "fabricaEntidad"),
        @Mapping(target = "estatus", source = "estatusEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
    })
    Usuario usuarioEntidadToUsuarioDTO(UsuarioEntidad usuarioEntidad);
    
    List<Usuario> usuariosEntidadesToUsuariosDTO(List<UsuarioEntidad> usuariosEntidades);
    
    
    List<Perfil> perfilesEntidadesToPerfilesDTO(List<PerfilEntidad> perfilEntidadList);
    
    @Mappings({
        @Mapping(target = "categoria", source = "categoriaEntidad"),
        @Mapping(target = "libreria", source = "libreriaEntidad"),
        @Mapping(target = "rol", source = "rolEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "usuario", ignore = true)
    })
    Perfil perfileEntidadToPerfilDTO(PerfilEntidad perfilEntidad);
    
    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    Rol rolEntidadToRolDTO(RolEntidad rolEntidad);
    
    
    @Mappings({
        @Mapping(target = "datoAdicional", source = "datoAdicionalEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    ValorDatoAdicional valorDatoAdicionalEntidadToValorDatoAdicionalDTO(ValorDatoAdicionalEntidad valorDatoAdicionalEntidad);
    
    @Mappings({
        @Mapping(target = "valorDatoAdicionales", source = "valorDatoAdicionalEntidadList"),
        @Mapping(target = "tipoDocumento", source = "tipodocumentoEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    DatoAdicional datoadicionaEntidadToDatoadicionalDTO(DatoAdicionalEntidad datoAdicionalEntidad);
    
    
    @Mappings({
        @Mapping(target = "infodocumentos", source = "infodocumentoEntidadList"),
        @Mapping(target = "foliaturas", source = "foliaturaEntidadList"),
        @Mapping(target = "datoAdicionales", source = "datoAdicionalEntidadList"),
        @Mapping(target = "subcategoria", source = "subcategoriaEntidad"),
        @Mapping(target = "categoria", source = "categoriaEntidad"),
        @Mapping(target = "estatus", source = "estatusEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    TipoDocumento tipodocumentoEntidadToTipodocumentoDTO(TipodocumentoEntidad tipodocumentoEntidad);
    
    @Mappings({
        @Mapping(target = "categoria", source = "categoriaEntidad"),
        @Mapping(target = "estatus", source = "estatusEntidad"),
        @Mapping(target = "tipodocumentos", source = "tipodocumentoEntidadList"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    SubCategoria subcategoriaEntidadToSubcategoriaDTO(SubcategoriaEntidad subcategoriaEntidad);
    
    @Mappings({
        @Mapping(target = "categoria", source = "categoriaEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "valor", ignore = true),
        @Mapping(target = "updateIndices", ignore = true),
        @Mapping(target = "expedientes", ignore = true)
    })
    Indice indiceEntidadToIndiceDTO(IndicesEntidad indicesEntidad);
    
    
    @Mappings({
        @Mapping(target = "indices", source = "indicesEntidadList"),
        @Mapping(target = "libreria", source = "libreriaEntidad"),
        @Mapping(target = "subcategorias", source = "subcategoriaEntidadList"),
        @Mapping(target = "tipodocumentos", source = "tipodocumentoEntidadList"),
        @Mapping(target = "estatus", source = "estatusEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
    })
    Categoria categoriaEntidadToCategoriaDTO(CategoriaEntidad categoriaEntidad);
    
    @Mappings({
        @Mapping(target = "categorias", source = "categoriaEntidadList"),
        @Mapping(target = "estatus", source = "estatusEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "expedientes", ignore = true),
        @Mapping(target = "perfiles", ignore = true),
    })
    Libreria libreriaEntidadToLibreriaDTO(LibreriaEntidad libreriaEntidad);
    
    @Mappings({
        @Mapping(target = "infoDocumento", source = "infodocumentoEntidad"),
        @Mapping(target = "tipoDocumento", source = "tipodocumentoEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    Foliatura foliaturaEntidadToFoliaturaDTO(FoliaturaEntidad datoAdicionalEntidad);
    
    @Mappings({
        @Mapping(target = "tipoDocumento", source = "tipodocumentoEntidad"),
        @Mapping(target = "estatusDocumento", source = "estatusDocumentoEntidad"),
        @Mapping(target = "foliaturas", source = "foliaturaEntidadList"),
        @Mapping(target = "datosInfodocumentos", source = "datosInfodocumentoEntidadList"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    InfoDocumento infoDocumentoEntidadToInfoDocumentoDTO(InfodocumentoEntidad infodocumentoEntidad);
    
    
    @Mappings({
        @Mapping(target = "infodocumentos", source = "infodocumentoEntidadList"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    EstatusDocumento estatusDocumentoEntidadToEstatusDocumentoDTO(EstatusDocumentoEntidad estatusDocumentoEntidad);
    
    @Mappings({
        @Mapping(target = "infoDocumento", source = "infodocumentoEntidad"),
        @Mapping(target = "documentoEliminado", source = "documentoEliminadoEntidad"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    DatosInfoDocumento datosInfoDocumentoEntidadToDatosInfoDocumentoDTO(DatosInfodocumentoEntidad datosInfodocumentoEntidad);
    
    @Mappings({
        @Mapping(target = "datosInfodocumentos", source = "datosInfodocumentoEntidadList"),
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    DocumentoEliminado documentoEliminadoEntidadToDocumentoEliminadoDTO(DocumentoEliminadoEntidad documentoEliminadoEntidad);
    
    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    Configuracion configuracionEntidadToConfiguracionDTO(ConfiguracionEntidad configuracionEntidad);
    
}
