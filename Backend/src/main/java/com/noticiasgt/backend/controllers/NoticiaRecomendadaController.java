package com.noticiasgt.backend.controllers;
import com.noticiasgt.backend.models.NoticiaRecomendada;
import com.noticiasgt.backend.services.NoticiaRecomendadaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticias-recomendadas")
public class NoticiaRecomendadaController {

    private final NoticiaRecomendadaService noticiaRecomendadaService;

    public NoticiaRecomendadaController(NoticiaRecomendadaService noticiaRecomendadaService) {
        this.noticiaRecomendadaService = noticiaRecomendadaService;
    }

    /**
     * Endpoint para obtener todas las noticias recomendadas.
     *
     * @return Lista de noticias recomendadas.
     */
    @GetMapping
    public List<NoticiaRecomendada> obtenerTodasLasNoticiasRecomendadas() {
        return noticiaRecomendadaService.obtenerTodasLasNoticiasRecomendadas();
    }
}
