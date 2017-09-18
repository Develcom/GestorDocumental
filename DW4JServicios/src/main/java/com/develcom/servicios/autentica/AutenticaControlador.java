/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.servicios.autentica;

import com.develcom.enlaces.Sesion;
import com.develcom.enlaces.Usuario;
import com.develcom.enlaces.DW4JExcepcion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author Administrador
 */
@RestController
@RequestMapping("/autentica")
public class AutenticaControlador {

    @RequestMapping(value = "/prueba", method = GET)
    public String prueba() {
        return "Hola Mundo";
    }

    @Autowired
    private AutenticaBF autenticaBF;

    @GetMapping(value = "/verificarUsuario/{user}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sesion verificarUsuario(@PathVariable String user, @PathVariable String password) throws DW4JExcepcion {
//    public Sesion verificarUsuario(@RequestBody Usuario usuario) throws DW4JExcepcion {
        return autenticaBF.verificarUsuario(user, password);
    }

    @GetMapping(value = "/autocompletar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> autocompletar() throws DW4JExcepcion {
        return autenticaBF.autocompletar();
    }

//    @RequestMapping(method = GET)
//    public List<Object> list() {
//        return null;
//    }
//    
//    @RequestMapping(value = "/{id}", method = GET)
//    public Object get(@PathVariable String id) {
//        return null;
//    }
//    
//    @RequestMapping(value = "/{id}", method = PUT)
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
//        return null;
//    }
//    
//    @RequestMapping(value = "/{id}", method = POST)
//    public ResponseEntity<?> post(@PathVariable String id, @RequestBody Object input) {
//        return null;
//    }
//    
//    @RequestMapping(value = "/{id}", method = DELETE)
//    public ResponseEntity<Object> delete(@PathVariable String id) {
//        return null;
//    }
}
