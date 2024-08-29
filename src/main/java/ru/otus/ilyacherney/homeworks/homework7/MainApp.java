package ru.otus.ilyacherney.homeworks.homework7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        //1
        int[][] arr = new int[][]{{1, 2, -5}, {-4, -1, 2}, {-4, -1, 2}};
        System.out.println(sumOfPositiveElements(arr));

        //2
        printSquare(5);

        //3
        nullifyDiagonal(arr);
        System.out.println("Массив после зануления диагонали:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //4
        int maxElement = findMax(arr);
        System.out.println("Максимальный элемент массива: " + maxElement);

        //5
        int sum = sumOfSecondRow(arr);
        System.out.println("Сумма элементов второй строки: " + sum);

    }

    //1
    private static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) sum += arr[i][j];
            }
        }
        return sum;
    }

    //2
    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
        }
    }

    //3
    private static void nullifyDiagonal(int[][] array) {
        int n = Math.min(array.length, array[0].length);
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
        }
    }

    //4
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //5
    public static int sumOfSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
        }
        return sum;
    }
}
