/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.servicios.administracion;

import com.develcom.enlaces.Perfil;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eescalona
 */
@RestController
@RequestMapping("/administraagrega")
public class AdministraAgregaControlador {
    
    
    @GetMapping(value = "/agregarPerfil/{perfil}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean agregarPerfil(@PathVariable List<Perfil> perfil) {
        return false;
    }
    
}
