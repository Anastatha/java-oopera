package ru.practicum.theatre.persons;

import ru.practicum.theatre.enums.Gender;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(gender, actor.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height, gender);
    }
}
