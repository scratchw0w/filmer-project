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
@SessionAttributes({ "tList", "fList", "array" , "filmTitle"})
public class MainController {

    @Autowired
    FilmLibrary fl = new FilmLibrary();

    private List<Film> filmsList;

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
        filmsList = getFilms(genres);
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
        List<Film> likedFilms = gettingLikedFilms(filmsList, arr);
        likedFilms.forEach((v) -> System.out.println(v.getInfo()));
        if (likedFilms.isEmpty()) {
            theModel.addAttribute("likedFilms", "FUNCTION..");
            return;
        }

        // Find some interesting films for user

        // Adding this film to the model Attribute
        theModel.addAttribute("likedFilms", "FUNCTION..");
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

    @GetMapping("/film")
    public String filmPage(){
        return "chosen_film";
    }


    private List<Film> filmGetter(int val, String genreArg)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Random random = new Random();
        Class cl = FilmLibrary.class;
        Method getList = cl
                .getDeclaredMethod("get" + genreArg.substring(0, 1).toUpperCase() + genreArg.substring(1) + "List");
        getList.setAccessible(true);
        List<Film> result = (List<Film>) getList.invoke(fl);

        int index = random.nextInt(10);
        return result.subList(index, index + val);
    }

    private List<Film> getFilms(List<String> genreList)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (genreList.size() == 0)
            throw new RuntimeException();
        if (genreList.size() == 1) {
            List<Film> result = filmGetter(12, genreList.get(0));
            return result;
        }
        if (genreList.size() == 2) {
            List<Film> partF = filmGetter(6, genreList.get(0));
            List<Film> partS = filmGetter(6, genreList.get(1));
            List<Film> result = new ArrayList<>();
            result.addAll(0, partF);
            result.addAll(5, partS);
            return result;
        }
        if (genreList.size() == 3) {
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

    private List<Film> gettingLikedFilms(List<Film> sourceList, List<String> likedFilms) {
        List<Film> acceptedFilms = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (likedFilms.get(i).equals("true"))
                acceptedFilms.add(sourceList.get(i));
        }
        return acceptedFilms;
    }
}