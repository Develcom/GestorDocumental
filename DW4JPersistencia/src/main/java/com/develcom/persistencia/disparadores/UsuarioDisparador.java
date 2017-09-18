package com.develcom.persistencia.disparadores;

import com.develcom.persistencia.entidades.UsuarioEntidad;
import com.develcom.persistencia.excepcion.ExceptionDisparador;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class UsuarioDisparador {

    @PrePersist
    @PreUpdate
    public void validacionesUsuario(UsuarioEntidad usuario) throws ExceptionDisparador {
        validarUsuario(usuario);
        validarNombre(usuario);
        validarApellido(usuario);
    }

    private void validarUsuario(UsuarioEntidad usuario) throws ExceptionDisparador {
        if (usuario.getIdUsuario()== null) {
            throw new ExceptionDisparador("Debe colocar el usuario");
        }
    }

    private void validarNombre(UsuarioEntidad usuario) throws ExceptionDisparador {
        if (usuario.getNombre()== null) {
            throw new ExceptionDisparador("Debe colocar el nombre");
        }
    }

    private void validarApellido(UsuarioEntidad usuario) throws ExceptionDisparador {
        if (usuario.getApellido()== null) {
            throw new ExceptionDisparador("Debe colocar el apellido");
        }
    }
}
