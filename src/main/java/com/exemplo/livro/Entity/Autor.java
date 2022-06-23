package com.exemplo.livro.Entity;

import javax.persistence.*;

public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "autor")
    private String nomeAutor;

    @Column(name = "idade_do_autor")
    private String idade;

    @ManyToMany
    private Livro livro;

    public Autor() {
    }

    public Autor(Long id, String nomeAutor, String idade) {
        this.id = id;
        this.nomeAutor = nomeAutor;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Livro getLivro() {
        return livro;
    }
}
