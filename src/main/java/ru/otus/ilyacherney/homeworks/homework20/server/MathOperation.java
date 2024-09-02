package ru.otus.ilyacherney.homeworks.homework20.server;

public class MathOperation {
    private int num1;
    private String operand;
    private int num2;

    MathOperation(String[] array) {
        this.num1 = Integer.parseInt(array[0]);
        this.operand = array[1];
        this.num2 = Integer.parseInt(array[2]);;
    }

    public int execute() {
        int result = 0;
        switch (operand) {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
        }
        return result;
    }
}
