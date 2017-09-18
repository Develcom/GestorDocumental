/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.cliente.util;

/**
 *
 * @author Administrador
 */
public class SesionGlobal {

    private static String puerto;
    private static String servidor;
    private static String logo;

    public static String getPuerto() {
        return puerto;
    }

    public static void setPuerto(String puerto) {
        SesionGlobal.puerto = puerto;
    }

    public static String getServidor() {
        return servidor;
    }

    public static void setServidor(String servidor) {
        SesionGlobal.servidor = servidor;
    }

    public static String getLogo() {
        return logo;
    }

    public static void setLogo(String logo) {
        SesionGlobal.logo = logo;
    }
}
