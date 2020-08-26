package com.scratchy.filmer.controllers;

import com.scratchy.filmer.entity.Film;
import com.scratchy.filmer.store.FilmLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Controller
@SessionAttributes("tList")
public class MainController {

    @Autowired
    FilmLibrary fl = new FilmLibrary();

    @RequestMapping("/")
    public String welcome_page(){
        return "welcome_page";
    }

    @PostMapping(value = "/process")
    public void process(@RequestParam("arr[]") List<String> arr, Model theModel) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<String> genres = new ArrayList<>(arr);
        System.out.println("In process()");
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        List<Film> filmsList = getFilms(genres);
        filmsList.forEach((v) -> System.out.println(v.getInfo()));
        theModel.addAttribute("fList", filmsList);
    }

    @RequestMapping("/films")
    public String finalResults() {
       return "film_page";
    }

    private List<Film> filmGetter(int val, String genreArg) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Random random = new Random();
        Class cl = FilmLibrary.class;
        Method getList = cl.getDeclaredMethod("get" + genreArg.substring(0, 1).toUpperCase()
                + genreArg.substring(1) + "List");
        getList.setAccessible(true);
        List<Film> result = (List<Film>) getList.invoke(fl);

        int index = random.nextInt(10);
        return result.subList(index, index + val);
    }
    private List<Film> getFilms(List<String> genreList) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if(genreList.size() == 0) throw new RuntimeException();
        if(genreList.size() == 1) {
            List<Film> result = filmGetter(12, genreList.get(0));
            return result;
        }
        if (genreList.size() == 2){
            List<Film> partF = filmGetter(6, genreList.get(0));
            List<Film> partS = filmGetter(6, genreList.get(1));
            List<Film> result = new ArrayList<>();
            result.addAll(0, partF);
            result.addAll(5, partS);
            return result;
        }
        if (genreList.size() == 3){
            List<Film> partF = filmGetter(4, genreList.get(0));
            List<Film> partS = filmGetter(4, genreList.get(1));
            List<Film> partT = filmGetter(4, genreList.get(2));
            List<Film> result = new ArrayList<>();
            result.addAll(0, partF);
            result.addAll(3, partS);
            result.addAll(7, partT);
            return result;
        }
        return null;
    }

}