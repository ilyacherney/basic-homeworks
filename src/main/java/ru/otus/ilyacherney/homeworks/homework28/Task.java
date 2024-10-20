package ru.otus.ilyacherney.homeworks.homework28;

public class Task implements Runnable {
    private char letter;
    private int repeats;
    private static Object lock;
    private static char nextLetter = 'A';

    public Task(char letter, int repeats) {
        this.letter = letter;
        this.repeats = repeats;
    }

    public static void setLock(Object lock) {
        Task.lock = lock;
    }


    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < repeats; i++) {
                try {
                    while (letter != nextLetter) {
                        lock.wait();
                    }
                        System.out.print(letter);
                        setNextLetter();
                        lock.notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void setNextLetter() {
        switch (letter) {
            case 'A': nextLetter = 'B';
                break;
            case 'B': nextLetter = 'C';
                break;
            case 'C': nextLetter = 'A';
        }
    }
}
