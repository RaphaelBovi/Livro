package com.exemplo.livro.Entity;

import javax.persistence.*;

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_do_livro")
    private String nomeLivro;

    @Column(name = "produtora")
    private String produtora;
    @Column(name = "data_de_lançamento")
    private String dataLancamento;

    @Column(name = "descrição_do_livro")
    private String descricao;

    @ManyToMany
    private Autor autor;

    public Livro() {
    }

    public Livro(Long id, String nomeLivro, String produtora, String dataLancamento, String descricao) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.produtora = produtora;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

}
