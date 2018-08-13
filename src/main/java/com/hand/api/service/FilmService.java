package com.hand.api.service;

import com.hand.domain.entity.Film;

import java.util.List;

public interface FilmService {
    List<Film> listAll();

    Film get(Integer id);

    void save(Film f);

}
