package com.exemplo.livro.Controller;

import com.exemplo.livro.Controller.Dtos.LivroResponse;
import com.exemplo.livro.Entity.Livro;
import com.exemplo.livro.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro save(@RequestBody @NotNull LivroResponse livro) {
        return livroService.save(livro.toModel());
    }

    @GetMapping(path = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<LivroResponse> findAll() {
        return LivroResponse.fromAll(livroService.findAll());
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LivroResponse findByID(@PathVariable("id") Long id) {
        return LivroResponse.from(livroService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        livroService.delete(id);
    }
}
