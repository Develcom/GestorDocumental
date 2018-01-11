/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.persistencia.repositorios;

import com.develcom.persistencia.entidades.PerfilEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author familia
 */
public interface PerfilRepositorio extends JpaRepository<PerfilEntidad, Long>{
    
}
