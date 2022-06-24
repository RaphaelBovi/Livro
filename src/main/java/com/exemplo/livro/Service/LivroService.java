package com.exemplo.livro.Service;

import com.exemplo.livro.Entity.Livro;
import com.exemplo.livro.Repository.LivroRepository;
import com.exemplo.livro.handler.LivroNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id).orElseThrow(LivroNotFoundException::new);
    }

    public void delete(Long id) {
        if (!livroRepository.existsById(id)) {
            throw new LivroNotFoundException();
        }
        livroRepository.deleteById(id);
    }
}
