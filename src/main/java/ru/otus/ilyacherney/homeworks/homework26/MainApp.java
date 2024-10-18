package ru.otus.ilyacherney.homeworks.homework26;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(7));
        appleBox.add(new Apple(3));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple(4));
        appleBox2.add(new Apple(1));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(4));
        orangeBox.add(new Orange(1));

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Apple(2));
        fruitBox.add(new Orange(3));


        printResults(appleBox, appleBox2);
        printResults(appleBox2, orangeBox);
        printResults(fruitBox, orangeBox);
        printResults(fruitBox, appleBox);

        transferResults(appleBox, appleBox2);
        transferResults(appleBox2, fruitBox);
//        transferResults(orangeBox, appleBox2); //не скомпилируется
//        transferResults(fruitBox.transferFruits(appleBox2)); //обратно тоже не скомпилируется

    }

    public static void printResults(Box<?> box1, Box<?> box2) {
        System.out.println("box1 weight: " + box1.countWeight());
        System.out.println("box2 weight: " + box2.countWeight());
        System.out.println("boxes equal? " + box1.compare(box2));
        System.out.println("------");
    }

    public static <T extends Fruit> void transferResults(Box<T> box1, Box<? super T> box2) {
        System.out.println("box1 fruits: " + box1.getFruits());
        System.out.println("box2 fruits: " + box2.getFruits());
        System.out.println("transferring");
        box1.transferFruits(box2); // No cast needed
        System.out.println("box1 fruits: " + box1.getFruits());
        System.out.println("box2 fruits: " + box2.getFruits());
        System.out.println("-------");
    }
}