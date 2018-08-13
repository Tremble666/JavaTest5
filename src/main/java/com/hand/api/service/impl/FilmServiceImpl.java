package com.hand.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper mapper;

    public List<Film> listAll() {
        return mapper.selectAll();
    }

    public Film get(Integer id) {
        return mapper.get(id);
    }

    public void save(Film f) {
        mapper.insert(f);
    }

}
