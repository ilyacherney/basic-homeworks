package ru.otus.ilyacherney.homeworks.homework14;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) throws AppArraySizeException, AppArrayDataException {
//        String[][] arr1 = new String[][]{
//                {"1", "2", "3", "4"},
//                {"5", "6", "7", "8"},
//                {"9", "10", "11", "12"}
//        };
//        System.out.println(method1(arr1));

        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        System.out.println(method1(arr2));

        String[][] arr3 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        System.out.println(method1(arr3));

        String[][] arr4 = new String[][]{
                {"1", "asdag", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        System.out.println(method1(arr4));
    }
    public static int method1(String[][] arr) {
        if (arr.length != 4) throw new AppArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new AppArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Невозможно преобразовать в число значение \"" + arr[i][j] + "\", находящееся в [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
