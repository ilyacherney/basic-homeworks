package ru.otus.ilyacherney.homeworks.homework21;

public class MyThread extends Thread {
    double[] arr;
    int start;
    int end;

    public MyThread (double[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {


        for (int i = start; i < end; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);

            String threadName = Thread.currentThread().getName();
//            System.out.println(threadName + ": " + arr[i]);
        }


    }
}
