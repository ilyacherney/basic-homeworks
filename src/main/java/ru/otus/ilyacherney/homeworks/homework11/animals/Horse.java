package ru.otus.ilyacherney.homeworks.homework11.animals;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
        stamina = 20;
        swimmingSpeed = 1;
        swimmingCost = 4;
        runningSpeed = 4;
    }
}