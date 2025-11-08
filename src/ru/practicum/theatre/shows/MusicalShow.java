package ru.practicum.theatre.shows;

import ru.practicum.theatre.persons.Director;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля '" + title + "':");
        System.out.println(librettoText);
        System.out.println();
    }
}

