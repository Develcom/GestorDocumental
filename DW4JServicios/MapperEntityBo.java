package com.develcom.servicios.mapper;

import com.develcom.enlaces.Categoria;
import com.develcom.enlaces.Causa;
import com.develcom.enlaces.ListaDesplegables;
import com.develcom.enlaces.Configuracion;
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
//import com.develcom.persistencia.entidades.CategoriaEntidad;
//import com.develcom.persistencia.entidades.CausaEntidad;
import com.develcom.persistencia.entidades.ConfiguracionEntidad;
//import com.develcom.persistencia.entidades.DatoAdicionalEntidad;
//import com.develcom.persistencia.entidades.DatosInfoDocumentoEntidad;
//import com.develcom.persistencia.entidades.DocumentoEliminadoEntidad;
//import com.develcom.persistencia.entidades.EstatusDocumentoEntidad;
import com.develcom.persistencia.entidades.EstatusEntidad;
//import com.develcom.persistencia.entidades.ExpedientesEntidad;
//import com.develcom.persistencia.entidades.FabricaEntidad;
//import com.develcom.persistencia.entidades.FoliaturaEntidad;
//import com.develcom.persistencia.entidades.IndicesEntidad;
//import com.develcom.persistencia.entidades.InfoDocumentoEntidad;
//import com.develcom.persistencia.entidades.LibreriaEntidad;
//import com.develcom.persistencia.entidades.ListaDesplegablesEntidad;
//import com.develcom.persistencia.entidades.PerfilEntidad;
//import com.develcom.persistencia.entidades.RolEntidad;
//import com.develcom.persistencia.entidades.SubCategoriaEntidad;
//import com.develcom.persistencia.entidades.TipoDocumentoEntidad;
import com.develcom.persistencia.entidades.UsuarioEntidad;
//import com.develcom.persistencia.entidades.ValorDatoAdicionalEntidad;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface MapperEntityBo {

    //mapeo de listas entidad a lista pojo
//    List<Categoria> entitysToBosC(List<CategoriaEntidad> categoriaEntidad);
//
//    List<Causa> entitysToBosCa(List<CausaEntidad> causaEntidad);
//
    List<Configuracion> entitysToBosCo(List<ConfiguracionEntidad> configuracionEntidad);
//
//    List<DatoAdicional> entitysToBosDA(List<DatoAdicionalEntidad> datoAdicionalEntidad);
//
//    List<DatosInfoDocumento> entitysToBosDID(List<DatosInfoDocumentoEntidad> datosInfoDocumentoEntidad);
//
//    List<DocumentoEliminado> entitysToBosDE(List<DocumentoEliminadoEntidad> documentoEliminadoEntidad);
//
//    List<EstatusDocumento> entitysToBosED(List<EstatusDocumentoEntidad> estatusDocumentoEntidad);

    List<Estatus> entitysToBosEs(List<EstatusEntidad> estatusEntidad);

//    List<Expedientes> entitysToBosEx(List<ExpedientesEntidad> expedientesEntidad);
//
//    List<Fabrica> entitysToBosFa(List<FabricaEntidad> fabricaEntidad);
//
//    List<Foliatura> entitysToBosFo(List<FoliaturaEntidad> foliaturaEntidad);
//
//    List<Indices> entitysToBosI(List<IndicesEntidad> indicesEntidad);
//
//    List<InfoDocumento> entitysToBosID(List<InfoDocumentoEntidad> infoDocumentoEntidad);
//
//    List<Libreria> entitysToBosL(List<LibreriaEntidad> libreriaEntidad);
//
//    List<ListaDesplegables> entitysToBosLD(List<ListaDesplegablesEntidad> listaDesplegablesEntidad);
//
//    List<Perfil> entitysToBosP(List<PerfilEntidad> perfilEntidad);
//
//    List<Rol> entitysToBosR(List<RolEntidad> rolEntidad);
//
//    List<SubCategoria> entitysToBosSC(List<SubCategoriaEntidad> subCategoriaEntidad);
//
//    List<TipoDocumento> entitysToBosTD(List<TipoDocumentoEntidad> tipoDocumentoEntidad);
//
    List<Usuario> entitysToBosU(List<UsuarioEntidad> usuarioEntidad);
//
//    List<ValorDatoAdicional> entitysToBosVDA(List<ValorDatoAdicionalEntidad> valorDatoAdicionalEntidad);
//
//    //mapeo de entida a pojo
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true),
//        @Mapping(target = "estatus", source = "estatusEntidad"),
//        @Mapping(target = "libreria", source = "libreriaEntidad"),
//        @Mapping(target = "subcategoriaList", source = "subCategoriaEntidadList"),
//        @Mapping(target = "tipodocumentoList", source = "tipoDocumentoEntidadList"),
//        @Mapping(target = "expedientesList", source = "expedientesEntidadList"),
//        @Mapping(target = "perfilList", source = "perfilEntidadList"),
//        @Mapping(target = "indicesList", source = "indicesEntidadList")
//        
//    })
//    Categoria entityToBo(CategoriaEntidad categoriaEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Causa entityToBo(CausaEntidad causaEntidad);

    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true)
    })
    Configuracion entityToBo(ConfiguracionEntidad configuracionEntidad);

//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true),
//        @Mapping(target = "valor", ignore = true),
//        @Mapping(target = "idValor", ignore = true),
//        @Mapping(target = "numeroDocumento", ignore = true),
//        @Mapping(target = "version", ignore = true),
//        @Mapping(target = "tipoDocumento", source = "tipoDocumentoEntidad"),
//        @Mapping(target = "valorDatoAdicionalList", source = "valorDatoAdicionalEntidadList")
//    })
//    DatoAdicional entityToBo(DatoAdicionalEntidad datoAdicionalEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    DatosInfoDocumento entityToBo(DatosInfoDocumentoEntidad datosInfoDocumentoEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    DocumentoEliminado entityToBo(DocumentoEliminadoEntidad documentoEliminadoEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    EstatusDocumento entityToBo(EstatusDocumentoEntidad estatusDocumentoEntidad);

    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(source = "usuariosEntidad", target = "usuarios")
    })
    Estatus entityToBo(EstatusEntidad estatusEntidad);

//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Expedientes entityToBo(ExpedientesEntidad expedientesEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Fabrica entityToBo(FabricaEntidad fabricaEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Foliatura entityToBo(FoliaturaEntidad foliaturaEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true),
//        @Mapping(source = "expedientesEntidadList", target = "expedientes")
//    })
//    Indices entityToBo(IndicesEntidad indicesEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true),
//        @Mapping(target = "reDigitalizo", ignore = true),
//        @Mapping(target = "datoAdicional", ignore = true),
//        @Mapping(source = "tipoDocumentoEntidad.tipoDocumento", target = "tipoDocumento"),
//        @Mapping(source = "tipoDocumentoEntidad.datoAdicional", target = "datoAdicionalE")
////        @Mapping(source = "tipoDocumentoEntidad.datoAdicionalList", target = "lsDatosAdicionales")
//    })
//    InfoDocumento entityToBo(InfoDocumentoEntidad infoDocumentoEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Libreria entityToBo(LibreriaEntidad libreriaEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    ListaDesplegables entityToBo(ListaDesplegablesEntidad listaDesplegablesEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Perfil entityToBo(PerfilEntidad perfilEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    Rol entityToBo(RolEntidad rolEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    SubCategoria entityToBo(SubCategoriaEntidad subCategoriaEntidad);
//
//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    TipoDocumento entityToBo(TipoDocumentoEntidad tipoDocumentoEntidad);

    @Mappings({
        @Mapping(target = "mensage", ignore = true),
        @Mapping(target = "modulo", ignore = true),
        @Mapping(target = "dw4jException", ignore = true),
        @Mapping(target = "rol", ignore = true),
        @Mapping(source = "estatusEntidad", target = "estatus"),
    })
    Usuario entityToBo(UsuarioEntidad usuarioEntidad);

//    @Mappings({
//        @Mapping(target = "mensage", ignore = true),
//        @Mapping(target = "modulo", ignore = true),
//        @Mapping(target = "dw4jException", ignore = true)
//    })
//    ValorDatoAdicional entityToBo(ValorDatoAdicionalEntidad valorDatoAdicionalEntidad);
}
