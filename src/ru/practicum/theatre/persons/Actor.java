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
        return super.toString() + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Actor actor = (Actor) obj;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
