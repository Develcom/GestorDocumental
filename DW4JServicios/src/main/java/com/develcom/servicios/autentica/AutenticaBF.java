/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.servicios.autentica;

import com.develcom.enlaces.DW4JExcepcion;
import com.develcom.enlaces.Sesion;
import com.develcom.enlaces.Usuario;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface AutenticaBF {
    
    Sesion verificarUsuario(String user, String password) throws DW4JExcepcion;

    List<Usuario> autocompletar() throws DW4JExcepcion;

    Sesion crearSesion(Usuario usuario) throws DW4JExcepcion;
    
}
