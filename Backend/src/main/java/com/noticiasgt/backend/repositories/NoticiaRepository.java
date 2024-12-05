package com.noticiasgt.backend.repositories;


import com.noticiasgt.backend.models.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}