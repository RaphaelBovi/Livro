package com.exemplo.livro.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_do_livro")
    private String nomeLivro;

    @Column(name = "data_de_lançamento")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dataPublicacao;

    @Column(name = "descrição_do_livro")
    private String descricao;

    @Column(name = "autor")
    private String autor;

    public Livro() {
    }

    public Livro(Long id, String nomeLivro, LocalDateTime dataPublicacao, String descricao, String autor) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.dataPublicacao = dataPublicacao;
        this.descricao = descricao;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public LocalDateTime getDataLancamento() {
        return dataPublicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAutor() {
        return autor;
    }

}
