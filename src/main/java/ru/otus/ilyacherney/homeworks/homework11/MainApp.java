package ru.otus.ilyacherney.homeworks.homework11;
import ru.otus.ilyacherney.homeworks.homework11.animals.Animal;
import ru.otus.ilyacherney.homeworks.homework11.animals.Dog;
import ru.otus.ilyacherney.homeworks.homework11.animals.Horse;
import ru.otus.ilyacherney.homeworks.homework11.animals.Cat;

public class MainApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        Horse horse = new Horse("Strela");
        Cat cat = new Cat("Barsik");
        int distance = 2;

        dog.info();
        horse.info();
        cat.info();

        dog.run(2);
        horse.run(2);
        cat.run(2);

        dog.info();
        horse.info();
        cat.info();

        dog.swim(2);
        horse.swim(2);
        cat.swim(2);

        dog.info();
        horse.info();
        cat.info();

        dog.swim(2);
        horse.swim(2);
        cat.swim(2);

        dog.info();
        horse.info();
        cat.info();

        dog.swim(2);
        horse.swim(2);
        cat.swim(2);

        dog.info();
        horse.info();
        cat.info();
    }
}
