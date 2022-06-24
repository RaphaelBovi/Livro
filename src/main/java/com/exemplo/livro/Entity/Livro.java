package com.exemplo.livro.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_do_livro")
    private String nomeLivro;

    @Column(name = "data_de_lançamento")
    @JsonFormat(pattern = "yyyy")
    private LocalDate dataLancamento;

    @Column(name = "descrição_do_livro")
    private String descricao;

    @Column(name = "autor")
    private String autor;

    public Livro() {

    }

    public Livro(String nomeLivro, String descricao, LocalDate dataLancamento, String autor) {
    }

    public Livro(Long id, String nomeLivro, LocalDate dataLancamento, String descricao, String autor) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAutor() {
        return autor;
    }

}
