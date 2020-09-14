package com.scratchy.filmer.supportmethods;

import com.scratchy.filmer.entity.Film;
import com.scratchy.filmer.store.FilmLibrary;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class SupportClass{ 


    public static List<String> getFinalFilm(List<Film> likedFilms) {
        List<String> result = new ArrayList<>();

        return result;
    }

    public static List<Film> filmGetter(int val, String genreArg, FilmLibrary fl)
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

    public static List<Film> getFilms(List<String> genreList, FilmLibrary fl)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (genreList.size() == 0)
            throw new RuntimeException();
        if (genreList.size() == 1) {
            List<Film> result = filmGetter(12, genreList.get(0), fl);
            return result;
        }
        if (genreList.size() == 2) {
            List<Film> partF = filmGetter(6, genreList.get(0), fl);
            List<Film> partS = filmGetter(6, genreList.get(1), fl);
            List<Film> result = new ArrayList<>();
            result.addAll(0, partF);
            result.addAll(5, partS);
            return result;
        }
        if (genreList.size() == 3) {
            List<Film> partF = filmGetter(4, genreList.get(0), fl);
            List<Film> partS = filmGetter(4, genreList.get(1), fl);
            List<Film> partT = filmGetter(4, genreList.get(2), fl);
            List<Film> result = new ArrayList<>();
            result.addAll(0, partF);
            result.addAll(3, partS);
            result.addAll(7, partT);
            return result;
        }
        return null;
    }

    public static List<Film> gettingLikedFilms(List<Film> sourceList, List<String> likedFilms) {
        List<Film> acceptedFilms = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (likedFilms.get(i).equals("true"))
                acceptedFilms.add(sourceList.get(i));
        }
        return acceptedFilms;
    }   
}