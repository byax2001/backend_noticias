package com.noticiasgt.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "noticia_destacada")
@Data
public class NoticiaRecomendada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "noticia_id", nullable = false)
    private Noticia noticia;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
}