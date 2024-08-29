package ru.otus.ilyacherney.homeworks.homework17;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
//        System.out.println(list);

        SearchTreeImpl searchTree = new SearchTreeImpl(list);
        System.out.println(searchTree);
//        System.out.println(searchTree.find(10));

        System.out.println(searchTree.getSortedList());
    }
}
