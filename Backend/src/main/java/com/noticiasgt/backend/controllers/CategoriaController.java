package com.noticiasgt.backend.controllers;
import com.noticiasgt.backend.models.Categoria;
import com.noticiasgt.backend.services.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> obtenerCategorias() {
        return categoriaService.obtenerCategorias();
    }
}