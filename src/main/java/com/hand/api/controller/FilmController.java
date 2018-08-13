package com.hand.api.controller;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;




    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Film> list(Page page){
        int pageNum = page.getPage();
        int pageSize = page.getPageSize();
        PageHelper.startPage(pageNum, pageSize);

        List<Film> films =  filmService.listAll();
        return films;
    }

    @RequestMapping("/get/{id}")
    @ResponseBody
    public Film get(@PathVariable("id") Integer id){
        System.out.println(id);
        return filmService.get(id);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        Film f = new Film();
        f.setTitle("六道仙人");
        f.setDescription("好");
        f.setRelease_year("2006");
        f.setLanguage_id(Integer.valueOf(1));
        f.setOriginal_language_id(null);
        f.setRental_duration(4);
        f.setRental_rate(new BigDecimal("22"));
        f.setLength(20);
        f.setReplacement_cost(new BigDecimal(200));
        f.setRating("PG");
        f.setSpecial_features("Commentaries");
        f.setLast_update("2006-02-15 05:03:42");

        filmService.save(f);

        return "hello2";
    }
}
