package com.noticiasgt.backend.controllers;
import com.noticiasgt.backend.models.Noticia;
import com.noticiasgt.backend.services.NoticiaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {
    private final NoticiaService noticiaService;

    public NoticiaController(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @PostMapping
    public Noticia agregarNoticia(@RequestBody Noticia noticia) {
        return noticiaService.agregarNoticia(noticia);
    }
}