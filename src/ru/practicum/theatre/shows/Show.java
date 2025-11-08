package ru.practicum.theatre.shows;

import ru.practicum.theatre.persons.Actor;
import ru.practicum.theatre.persons.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director);
    }

    public void printActorInfo() {
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле " + title + " пока нет актёров");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("актёр " + actor + " уже участвует в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + currentActor + " заменён на " + newActor + " в спектакле");
                return;
            }
        }
        System.out.println("Актёр с фамилией '" + surnameToReplace + "' не найден в спектакле");
    }
}
