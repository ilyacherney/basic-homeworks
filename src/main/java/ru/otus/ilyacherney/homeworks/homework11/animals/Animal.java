package ru.otus.ilyacherney.homeworks.homework11.animals;

public abstract class Animal {
    String name;
    float runningSpeed;
    float runningCost;
    float swimmingSpeed;
    float swimmingCost;
    int stamina;
    public Animal(String name) {
        this.name = name;
        runningCost = 1;
    }
    public String getName() {
        return name;
    }
    public float run(int distance) {
        if (stamina - runningCost * distance > 0) {
            float time = distance / runningSpeed;
            System.out.println(name + " бежит.");
            stamina--;
            System.out.println(name + " пробежал расстояние " + distance + " за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " не хватает выносливости.");
            return -1;
        }
    };
    public float swim(int distance) {
        if (swimmingSpeed == 0) {
            System.out.println(name  + " не умеет плавать.");
            return 0;
        }
        if (stamina - swimmingCost * distance > 0) {
            float time = distance / swimmingSpeed;
            stamina -= distance * swimmingCost;
            System.out.println(name + " проплыл расстояние " + distance + " за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " не хватает выносливости.");
            return -1;
        }
    };
    public void info() {
        System.out.println("---------------------------");
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed);
        System.out.println("Скорость плавания: " + swimmingSpeed);
        System.out.println("Выносливость: " + stamina);
        System.out.println("---------------------------");
    }
}
