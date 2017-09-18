/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.enlaces;

import java.util.List;
import java.util.Properties;

/**
 *
 * @author Administrador
 */
public class DW4JSesion {

    private static String login;
    private static String nombres;
    private static List<Sesion> sesion;
    private static Expedientes expedientes;
    private static List<Indice> indices;
    private static SubCategoria subCategoria;
    private static TipoDocumento tipoDocumento;
    private static int sizeSearch;
    private static Configuracion configuracion;
    private static Properties sesPropiedades;
    private static boolean buscarTodosExpedientes;

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        DW4JSesion.login = login;
    }

    public static String getNombres() {
        return nombres;
    }

    public static void setNombres(String nombres) {
        DW4JSesion.nombres = nombres;
    }

    public static List<Sesion> getSesion() {
        return sesion;
    }

    public static void setSesion(List<Sesion> sesion) {
        DW4JSesion.sesion = sesion;
    }

    public static Expedientes getExpedientes() {
        return expedientes;
    }

    public static void setExpedientes(Expedientes expedientes) {
        DW4JSesion.expedientes = expedientes;
    }

    public static List<Indice> getIndices() {
        return indices;
    }

    public static void setIndices(List<Indice> indices) {
        DW4JSesion.indices = indices;
    }

    public static SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public static void setSubCategoria(SubCategoria subCategoria) {
        DW4JSesion.subCategoria = subCategoria;
    }

    public static TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public static void setTipoDocumento(TipoDocumento tipoDocumento) {
        DW4JSesion.tipoDocumento = tipoDocumento;
    }

    public static int getSizeSearch() {
        return sizeSearch;
    }

    public static void setSizeSearch(int sizeSearch) {
        DW4JSesion.sizeSearch = sizeSearch;
    }

    public static Configuracion getConfiguracion() {
        return configuracion;
    }

    public static void setConfiguracion(Configuracion configuracion) {
        DW4JSesion.configuracion = configuracion;
    }

    public static Properties getSesPropiedades() {
        return sesPropiedades;
    }

    public static void setSesPropiedades(Properties sesPropiedades) {
        DW4JSesion.sesPropiedades = sesPropiedades;
    }

    public static boolean isBuscarTodosExpedientes() {
        return buscarTodosExpedientes;
    }

    public static void setBuscarTodosExpedientes(boolean buscarTodosExpedientes) {
        DW4JSesion.buscarTodosExpedientes = buscarTodosExpedientes;
    }
    
}
