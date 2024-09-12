package ru.otus.ilyacherney.homeworks.homework21;

public class MainApp {
    public static void main(String[] args) {
        double[] arr = new double[1_000_000];

        long startTime = System.currentTimeMillis();
        countWithOneThread(arr);
        long endTime = System.currentTimeMillis();
        long timeElapsedOneStream = endTime - startTime;


        startTime = System.currentTimeMillis();
        countWithMultipleThreads(arr, 4);
        endTime = System.currentTimeMillis();
        long timeElapsedMultipleStreams = endTime - startTime;

        System.out.println("Один поток: " + timeElapsedOneStream);
        System.out.println("Четыре потока: " + timeElapsedMultipleStreams);
    }

    public static void countWithOneThread(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            System.out.println(arr[i]);
        }

    }

    public static void countWithMultipleThreads(double[] arr, int threadsAmount) {
        int partition = arr.length / threadsAmount;
        int remainder = arr.length % threadsAmount;  // Остаток для последнего потока

        Thread[] threads = new Thread[threadsAmount];

        int start = 0;
        for (int i = 0; i < threadsAmount; i++) {
            int end = start + partition + (i == threadsAmount - 1 ? remainder : 0);  // Последний поток берет остаток

            MyThread myThread = new MyThread(arr, start, end);
            threads[i] = myThread;
            myThread.start();

            start = end;  // Обновляем старт для следующего потока
        }

        // Ждем завершения всех потоков
        for (int i = 0; i < threadsAmount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
