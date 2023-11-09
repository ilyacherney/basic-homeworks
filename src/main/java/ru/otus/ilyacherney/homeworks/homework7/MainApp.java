package ru.otus.ilyacherney.homeworks.homework7;

public class MainApp {
    public static void main (String[] args) {
        //1
        int[][] numbers1 = {{1, 0, 3}, {4, 5, 0}};
        System.out.println(sumOfPositiveElements(numbers1));


        //2
        printSquare(5);

        //3
        int[][] numbers3 = new int[10][10];
        setDiagonalToZero(numbers3);

        //4
        int[][] numbers4 = {{1, 0, 3}, {4, 5, 0}};
        System.out.println(findMax(numbers4));

        //5
        int[][] numbers5 = {{1, 0, 3}, {4, 4, 0}, {2, 5, 8}};
//        int[][] numbers5 = {{1, 0, 3}};
        System.out.println(sumSecondRow(numbers5));
    }
    //1
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    //2
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    //3
    public static void setDiagonalToZero(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "  ");

            }
            System.out.println();
        }
    }

    //4
    public static int findMax(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               if (array[i][j] > maxValue) {
                   maxValue = array[i][j];
               }
           }
        }
        return maxValue;
    }

    //5
    public static int sumSecondRow(int[][] array) {
        int sum = 0;
        if (array.length > 1) {
            int i = 1;
            for (int j = 0; j < array[1].length; j++) {
                sum += array[i][j];
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
