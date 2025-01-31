package com.senac.apifilmes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FilmesService {

    private final FilmesRepository filmesRepository;

    public FilmesService(FilmesRepository filmesRepository) {
        this.filmesRepository = filmesRepository;
    }

    public List<filmes> todosFilmes(){
        return filmesRepository.findAll();
    }
}
