package ru.otus.ilyacherney.homeworks.homework28;

import java.util.concurrent.*;

public class MainApp {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        Task.setLock(new Object());
        int repeats = 5;

        pool.execute(new Task('A', repeats));
        pool.execute(new Task('B', repeats));
        pool.execute(new Task('C', repeats));

        pool.shutdown();
    }
}
