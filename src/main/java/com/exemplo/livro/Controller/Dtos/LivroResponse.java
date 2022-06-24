package com.exemplo.livro.Controller.Dtos;

import com.exemplo.livro.Entity.Livro;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LivroResponse {

    private Long id;
    private String nomeLivro;

    private LocalDate dataLancamento;

    private String descricao;

    private String autor;


    public LivroResponse(Long id, String nomeLivro, String descricao, LocalDate dataLancamento, String autor) {
    }

    public LivroResponse(String nomeLivro, LocalDate dataLancamento, String descricao, String autor) {
        this.nomeLivro = nomeLivro;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.autor = autor;
    }

    public Livro toModel() {
        return new Livro(this.nomeLivro, this.descricao, this.dataLancamento, this.autor);
    }

    public static LivroResponse from(Livro livro) {
        return new LivroResponse(livro.getId(), livro.getNomeLivro(), livro.getDescricao(), livro.getDataLancamento(), livro.getAutor());
    }

    public static List<LivroResponse> fromAll(List<Livro> livro) {
        return livro.stream().map(LivroResponse::from).collect(Collectors.toList());
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
