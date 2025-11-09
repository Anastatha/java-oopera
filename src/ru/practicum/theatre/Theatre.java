package ru.practicum.theatre;

import ru.practicum.theatre.enums.Gender;
import ru.practicum.theatre.persons.Actor;
import ru.practicum.theatre.persons.Director;
import ru.practicum.theatre.shows.Ballet;
import ru.practicum.theatre.shows.Opera;
import ru.practicum.theatre.shows.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Максим", "Орлов", Gender.MALE, 180);
        Actor actor2 = new Actor("Алексей", "Захаров", Gender.MALE, 170);
        Actor actor3 = new Actor("Анастасия", "Орлова", Gender.FEMALE, 160);
        Actor actor4 = new Actor("Анастасия2", "Орлова2", Gender.FEMALE, 160);

        Director director1 = new Director("Сергей", "Васильев", Gender.MALE, 10);
        Director director2 = new Director("Мария", "Сизова", Gender.FEMALE, 5);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Лев Иванов";

        Show regularShow = new Show("Гамлет", 180, director1);
        Opera opera = new Opera("Евгений Онегин", 150, director2, musicAuthor,
                "Опера в трёх действиях по роману Александра Пушкина.", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 135, director1, musicAuthor,
                "Балет",
                choreographer);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // добавить дубликата
        ballet.addActor(actor1);
        System.out.println();

        System.out.println("Список актеров после распределения: ");
        regularShow.printActorInfo();
        opera.printActorInfo();
        ballet.printActorInfo();

        // заменяем актёра
        System.out.println("Замена актеров:");
        ballet.replaceActor(actor2, "Орлов");
        ballet.replaceActor(actor4, "Пет"); // заменить несуществующего
        System.out.println();

        System.out.println("Список актеров после замены:");
        ballet.printActorInfo();

        System.out.println("Либретто:");
        opera.printLibretto();
        ballet.printLibretto();
    }
}
