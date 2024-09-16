package ru.otus.ilyacherney.homeworks.homework12;

public class MainApp {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 1),
                new Cat("Dymok", 2),
                new Cat("Ryzhik", 3),
                new Cat("Chernomor", 4)
        };

        Plate plate = new Plate (5);

        for (Cat cat : cats) {
            System.out.println("------------------------------------");
            System.out.println(plate);
            System.out.println(cat);
            System.out.println(cat.getName() + " ест");
            cat.eat(plate);
            System.out.println(plate);
            System.out.println(cat);
        }
    }
}