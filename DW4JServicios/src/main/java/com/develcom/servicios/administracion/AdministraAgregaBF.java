/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.servicios.administracion;

import com.develcom.enlaces.DW4JExcepcion;
import com.develcom.enlaces.Perfil;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author eescalona
 */
public interface AdministraAgregaBF {
    
    boolean agregarPerfil(List<Perfil> perfil) throws DW4JExcepcion, NamingException;
    
}
