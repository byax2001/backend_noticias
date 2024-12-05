package com.noticiasgt.backend.repositories;
import com.noticiasgt.backend.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}