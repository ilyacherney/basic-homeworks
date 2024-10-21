package ru.otus.ilyacherney.homeworks.homework29;

public class MainApp {
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static void main(String[] args) {

    }

    public static int[] getElementsAfterLastOne(int[] arrIn) {

        int currentLastOneIndex = -1;
        for (int i = 0; i < arrIn.length; i++) {
            if (arrIn[i] == ONE) {
                currentLastOneIndex = i;
            }
        }

        if (currentLastOneIndex == -1) throw new RuntimeException();

        int arrOutLength = arrIn.length - currentLastOneIndex - 1;
        int[] arrOut = new int[arrOutLength];

        for (int j = 0; j < arrOutLength; j++) {
            arrOut[j] = arrIn[currentLastOneIndex + 1 + j];
        }

        return arrOut;
    }

    public static boolean hasOnlyOnesAndTwos(int[] arr) {
        boolean hasOne = false;
        boolean hasTwo = false;

        for (int el : arr) {
            if (el == ONE) hasOne = true;
            else if (el == TWO) hasTwo = true;
            else return false;
        }

        return (hasOne && hasTwo);
    }
}
