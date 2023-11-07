package ru.otus.ilyacherney.homeworks.homework5;
import java.util.Arrays;

import java.lang.reflect.Array;

public class MainApp {
    public static void main(String[] args) {
        printMultipleTimes(5, "hello");

        int[] array = {1, 2, 3};
        sumNumbers(array);

        int[] array2 = {1, 2, 3};
        increaseArray(1, array2);

        int[] array3 = {1, 1, 1, 1, 1};
        compareNumbers(array3);
    }
    public static void printMultipleTimes(int amount, String text) {
        for (int i = 0; i < amount; i++) {
            System.out.println(text);
        }
    }

    public static void sumNumbers(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void increaseArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void compareNumbers(int[] array) {
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < array.length; i++){
            if (i <= array.length/2 - 1) {
                firstHalfSum += array[i];
            } else {
                secondHalfSum += array[i];
            }
        }
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма первой половины чисел больше");
        } else if (firstHalfSum < secondHalfSum) {
            System.out.println("Сумма второй половины чисел больше");
        } else {
            System.out.println("Сумма половин чисел равны");
        }
    }


}

