package com.develcom.servicios.mapper;

import com.develcom.enlaces.Categoria;
import com.develcom.enlaces.Causa;
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
import com.develcom.enlaces.ListaDesplegables;
import com.develcom.enlaces.Perfil;
import com.develcom.enlaces.Rol;
import com.develcom.enlaces.SubCategoria;
import com.develcom.enlaces.TipoDocumento;
import com.develcom.enlaces.Usuario;
import com.develcom.enlaces.ValorDatoAdicional;
//import com.develcom.persistencia.entidades.CategoriaEntidad;
//import com.develcom.persistencia.entidades.CausaEntidad;
//import com.develcom.persistencia.entidades.ConfiguracionEntidad;
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

/**
 *
 * @author familia
 */
@Mapper(componentModel = "spring")
public interface MapperBoEntity {

    //mapeos de listas pojo a lista entidad
//    List<CategoriaEntidad> bosToEntitysC(List<Categoria> librerias);
//
//    List<CausaEntidad> bosToEntitysCa(List<Causa> causa);
//
//    List<ConfiguracionEntidad> bosToEntitysCo(List<Configuracion> configuracion);
//
//    List<DatoAdicionalEntidad> bosToEntitysDA(List<DatoAdicional> librerias);
//
//    List<DatosInfoDocumentoEntidad> bosToEntitysAID(List<DatosInfoDocumento> datosInfoDocumento);
//
//    List<DocumentoEliminadoEntidad> bosToEntitysDE(List<DocumentoEliminado> documentoEliminado);
//
//    List<EstatusDocumentoEntidad> bosToEntitysED(List<EstatusDocumento> estatusDocumento);

    List<EstatusEntidad> bosToEntitysEs(List<Estatus> estatus);

//    List<ExpedientesEntidad> bosToEntitysEx(List<Expedientes> expedientes);
//
//    List<FabricaEntidad> bosToEntitysFa(List<Fabrica> fabrica);
//
//    List<FoliaturaEntidad> bosToEntitysFo(List<Foliatura> foliatura);
//
//    List<IndicesEntidad> bosToEntitysI(List<Indices> indices);
//
//    List<InfoDocumentoEntidad> bosToEntitysID(List<InfoDocumento> infoDocumento);
//
//    List<LibreriaEntidad> bosToEntitysL(List<Libreria> librerias);
//
//    List<ListaDesplegablesEntidad> bosToEntitysLD(List<ListaDesplegables> listaDesplegables);
//
//    List<PerfilEntidad> bosToEntitysP(List<Perfil> perfil);
//
//    List<RolEntidad> bosToEntitysR(List<Rol> rol);
//
//    List<SubCategoriaEntidad> bosToEntitysSC(List<SubCategoria> librerias);
//
//    List<TipoDocumentoEntidad> bosToEntitysTD(List<TipoDocumento> librerias);
//
//    List<UsuarioEntidad> bosToEntitysU(List<Usuario> usuario);
//
//    List<ValorDatoAdicionalEntidad> bosToEntitysVDA(List<ValorDatoAdicional> valorDatoAdicional);
//
//    //mapeo de pojo a entidad
//    CategoriaEntidad boToEntity(Categoria librerias);
//
//    CausaEntidad boToEntity(Causa causa);
//    
//    ConfiguracionEntidad boToEntity(Configuracion configuracion);
//
//    DatoAdicionalEntidad boToEntity(DatoAdicional librerias);
//    
//    DatosInfoDocumentoEntidad boToEntity(DatosInfoDocumento datosInfoDocumento);
//    
//    DocumentoEliminadoEntidad boToEntity(DocumentoEliminado documentoEliminado);
//    
//    EstatusDocumentoEntidad boToEntity(EstatusDocumento estatusDocumento);

    EstatusEntidad boToEntity(Estatus estatus);
    
//    ExpedientesEntidad boToEntity(Expedientes expedientes);
//
//    FabricaEntidad boToEntity(Fabrica fabrica);
//    
//    FoliaturaEntidad boToEntity(Foliatura foliatura);
//
//    @Mapping(source = "expedientes", target = "expedientesEntidadList")
//    IndicesEntidad boToEntity(Indices indices);
//    
//    InfoDocumentoEntidad boToEntity(InfoDocumento infoDocumento);
//
//    LibreriaEntidad boToEntity(Libreria librerias);
//
//    ListaDesplegablesEntidad boToEntity(ListaDesplegables listaDesplegables);
//
//    PerfilEntidad boToEntity(Perfil perfil);
//
//    RolEntidad boToEntity(Rol rol);
//
//    SubCategoriaEntidad boToEntity(SubCategoria librerias);
//
//    TipoDocumentoEntidad boToEntity(TipoDocumento librerias);

    UsuarioEntidad boToEntity(Usuario usuario);

//    ValorDatoAdicionalEntidad boToEntity(ValorDatoAdicional valorDatoAdicional);

}
