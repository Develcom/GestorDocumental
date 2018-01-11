package com.develcom.persistencia.repositorios;

import com.develcom.persistencia.entidades.ConfiguracionEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface ConfiguracionRepositorio extends JpaRepository<ConfiguracionEntidad, Long> {

    ConfiguracionEntidad findByIdConfiguracion(@Param("idConfiguracion") Integer idConfiguracion);
    

}
