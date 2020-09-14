package com.scratchy.filmer.controllers;

import com.scratchy.filmer.entity.Film;
import com.scratchy.filmer.store.FilmLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.scratchy.filmer.supportmethods.SupportClass.getFilms;
import static com.scratchy.filmer.supportmethods.SupportClass.gettingLikedFilms;
import static com.scratchy.filmer.supportmethods.SupportClass.getFinalFilm;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

@Controller
@SessionAttributes({ "tList", "fList", "array" , "filmTitle", "resultFilm"})
public class MainController {

    @Autowired
    private FilmLibrary fl = new FilmLibrary();

    private List<Film> filmsList;
    private List<Film> likedFilms;
    private List<String> titleAndYear;

    @GetMapping("/")
    public String welcome_page() {
        return "welcome_page";
    }

    @PostMapping("/process")
    public void process(@RequestParam("arr[]") List<String> arr, Model theModel)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<String> genres = new ArrayList<>(arr);
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        filmsList = getFilms(genres, fl);
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        filmsList = getFilms(genres, fl);
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        filmsList = getFilms(genres, fl);
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        filmsList = getFilms(genres, fl);
        System.out.println(genres);
        theModel.addAttribute("tList", genres);
        filmsList = getFilms(genres, fl);
        filmsList.forEach((v) -> System.out.println(v.getInfo()));
        theModel.addAttribute("fList", filmsList);
    }

    @GetMapping("/films")
    public String filmListResults() {
        return "film_page";
    }

    @PostMapping("films/process")
    public void processLikedFilms(@RequestParam("arr[]") List<String> arr, Model theModel) {
        System.out.println("\n\n\nIn processLikedFilms");
        likedFilms = gettingLikedFilms(filmsList, arr);
        likedFilms.forEach((v) -> System.out.println(v.getInfo()));
        
        titleAndYear = new ArrayList<>();
        
        if (likedFilms.isEmpty()) {
            
            titleAndYear.add(filmsList.get(1).getGenre());
            titleAndYear.add(String.valueOf(filmsList.get(1).getYearOfProd()));

            System.out.println(titleAndYear);

            theModel.addAttribute("resultFilm", titleAndYear);
            return;
        }
        
        titleAndYear = getFinalFilm(likedFilms);

        System.out.println(titleAndYear);
        theModel.addAttribute("resultFilm", titleAndYear);

        
    }

    @GetMapping("/result")
    public String resultPage() {
        return "result_page";
    }

    @PostMapping("/filmprocessing")
    public void film_processing_page(@RequestParam("title") String title, Model theModel){
        StringBuilder str = new StringBuilder();
        str.append(title.substring(0, 1).toUpperCase());
        str.append(title.substring(1, title.length()));
        System.out.println(str);
        theModel.addAttribute("filmTitle", str);
    }

    public String filmPage(){
        return "chosen_film";
    }


    
}