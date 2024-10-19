package ru.otus.ilyacherney.homeworks.homework26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private T fruit;
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int countWeight() {
        int weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return (this.countWeight() == box.countWeight());
    }

    public void transferFruits(Box<? super T> box) {
        box.getFruits().addAll(this.fruits);
        this.fruits.clear();
    }

    public List<T> getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruit=" + fruit +
                ", fruits=" + Arrays.toString(fruits.toArray()) +
                '}';
    }
}
