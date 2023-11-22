package ru.otus.ilyacherney.homeworks.homework13;

import ru.otus.ilyacherney.homeworks.homework13.transport.Car;
import ru.otus.ilyacherney.homeworks.homework13.transport.Horse;
import ru.otus.ilyacherney.homeworks.homework13.transport.Rover;

public class MainApp {
    public static void main(String[] args) {
        Human human1 = new Human("Ilya");
        System.out.println(human1);
        Car car = new Car();
        System.out.println(car.info());
        human1.getOnTransport(car);
        System.out.println(human1);
        human1.ride(10, Terrain.SWAMP);
        System.out.println(car.info());
        System.out.println("------------------------");
        human1.leaveTransport();
        System.out.println(human1);
        human1.ride(20, Terrain.SWAMP);
        System.out.println("------------------------");
        Horse horse = new Horse();
        System.out.println(horse.info());
        human1.getOnTransport(horse);
        System.out.println(human1);
        human1.ride(30, Terrain.DEEP_FOREST);
        System.out.println(horse.info());
        human1.ride(30, Terrain.DEEP_FOREST);
        System.out.println(horse.info());
        human1.ride(30, Terrain.DEEP_FOREST);
        System.out.println(horse.info());
        human1.ride(30, Terrain.DEEP_FOREST);
        System.out.println(horse.info());
        System.out.println("------------------------");
        Rover rover = new Rover();
        System.out.println(rover.info());
        human1.getOnTransport(rover);
        human1.ride(10, Terrain.DEEP_FOREST);
        System.out.println(rover.info());
    }
}
