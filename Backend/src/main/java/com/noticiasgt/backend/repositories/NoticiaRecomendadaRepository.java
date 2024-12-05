package com.noticiasgt.backend.repositories;

import com.noticiasgt.backend.models.NoticiaRecomendada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRecomendadaRepository extends JpaRepository<NoticiaRecomendada, Long> {
}