/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.develcom.enlaces;

import java.io.Serializable;

public class DW4JExcepcion extends Throwable implements Serializable{

    private DW4JExcepcion dw4jException;
    private static final long serialVersionUID = 1692398413474730780L;

    public DW4JExcepcion(String message) {
        super(message);
    }

    public DW4JExcepcion(DW4JExcepcion dw4jException) {
        this.dw4jException = dw4jException;
    }
    
    public DW4JExcepcion getFaultInfo() {
        return dw4jException;
    }

}
