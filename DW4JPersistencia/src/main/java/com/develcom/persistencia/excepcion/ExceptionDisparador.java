/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.excepcion;

/**
 *
 * @author Administrador
 */
public class ExceptionDisparador extends Exception {
    
    private static final long serialVersionUID = -4188921720467306674L;

    public ExceptionDisparador(String message) {
        super(message);
    }

    public ExceptionDisparador(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDisparador(Throwable cause) {
        super(cause);
    }

    public ExceptionDisparador(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
