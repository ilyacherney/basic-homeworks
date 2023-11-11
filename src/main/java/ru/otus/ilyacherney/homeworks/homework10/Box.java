package ru.otus.ilyacherney.homeworks.homework10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Box {
    private int size;
    private String color;
    private boolean isEmpty;
    private String[] items;
    private boolean isOpened;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.isEmpty = true;
        this.items = new String[1];
        this.isOpened = false;
    }

    public void open() {
        isOpened = true;
        System.out.println("Коробка открыта");
        System.out.println();
    }

    public void close() {
        isOpened = false;
        System.out.println("Коробка закрыта");
        System.out.println();
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color);
        System.out.println();
    }

    public void info() {
        System.out.println("Размер: " + size);
        System.out.println("Цвет: " + color);
        System.out.println("Пустая?: " + isEmpty);
        System.out.println("Предметы: " + Arrays.toString(items));
        System.out.println("Открыта?: " + isOpened);
        System.out.println();
    }

    public void putItem(String item) {
        if (isEmpty && isOpened) {
            items[0] = item;
            isEmpty = false;
            System.out.println("Положили " + item);
            System.out.println();

        }
    }
    public void getItem() {
        if (!isEmpty && isOpened) {
            System.out.println("Достали " + items[0]);
            System.out.println();
            items[0] = null;
            isEmpty = true;
        }
    }
}
