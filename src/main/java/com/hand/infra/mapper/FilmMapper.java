package com.hand.infra.mapper;

import com.hand.domain.entity.Film;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface FilmMapper extends Mapper<Film> {
    Film get(Integer id);
}
