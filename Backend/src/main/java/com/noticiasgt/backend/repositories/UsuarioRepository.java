package com.noticiasgt.backend.repositories;
import com.noticiasgt.backend.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario")
    Usuario findByUsuario(@Param("usuario") String usuario);

    //Query de login
    @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.contrasena = :contrasena")
    Usuario login(@Param("usuario") String usuario, @Param("contrasena") String contrasena);
}
