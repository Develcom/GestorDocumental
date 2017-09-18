package com.develcom.persistencia.repositorios;

import com.develcom.persistencia.entidades.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioEntidad, Long> {
    
    UsuarioEntidad findByIdUsuarioAndPassword(@Param("idUsuario") String idUsuario, @Param("password") String password);
    UsuarioEntidad findByIdUsuario(@Param("idUsuario") String idUsuario);
    
}
