package com.noticiasgt.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "noticia_destacada")
@Data
public class NoticiaDestacada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "noticia_id", nullable = false)
    private Noticia noticia;
}