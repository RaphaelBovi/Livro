package com.exemplo.livro.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LivroNotFoundException extends RuntimeException {

    public LivroNotFoundException() {
        super("Solicitação do livro não encontrado");

    }

}