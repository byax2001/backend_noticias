package com.noticiasgt.backend.services;
import com.noticiasgt.backend.models.Noticia;
import com.noticiasgt.backend.repositories.NoticiaRepository;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService {
    private final NoticiaRepository noticiaRepository;

    public NoticiaService(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    public Noticia agregarNoticia(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }
}