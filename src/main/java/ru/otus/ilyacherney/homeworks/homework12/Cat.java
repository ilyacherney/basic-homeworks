package ru.otus.ilyacherney.homeworks.homework12;

public class Cat {
    String name;
    int appetite;
    boolean isFull;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat (Plate plate) {
        if (plate.takeFood(appetite)) {
            isFull = true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }
}

