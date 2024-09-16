package ru.otus.ilyacherney.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public String getName() {
        return name;
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

