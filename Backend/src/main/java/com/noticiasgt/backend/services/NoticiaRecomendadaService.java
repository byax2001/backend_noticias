package com.noticiasgt.backend.services;
import com.noticiasgt.backend.models.NoticiaRecomendada;
import com.noticiasgt.backend.repositories.NoticiaRecomendadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaRecomendadaService {

    private final NoticiaRecomendadaRepository noticiaRecomendadaRepository;

    public NoticiaRecomendadaService(NoticiaRecomendadaRepository noticiaRecomendadaRepository) {
        this.noticiaRecomendadaRepository = noticiaRecomendadaRepository;
    }

    /**
     * Retorna todas las noticias recomendadas.
     *
     * @return Lista de noticias recomendadas.
     */
    public List<NoticiaRecomendada> obtenerTodasLasNoticiasRecomendadas() {
        return noticiaRecomendadaRepository.findAll();
    }
}