package ru.otus.ilyacherney.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        listTextFiles(new File("src"));
        String fileName = getUserInput("Enter file name.");
        String fileContent = readFile(fileName);
        System.out.println(fileContent);
        String userInput = getUserInput("Enter text to add.");
        addToFile(fileName, userInput);

    }

    public static void listTextFiles(File dir) {
        File[] files = dir.listFiles();
        TextFileFilter filter = new TextFileFilter();
        String list = "";
        for (int i = 0; i < files.length; i++) {
            boolean isText = filter.accept(dir, files[i].toString());
            if (isText) System.out.println(files[i]);
        }
    }

    public static String getUserInput(String text) {
        System.out.println(text);
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        return fileName;
    }

    public static String readFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis)
        ) {
            String out = "";
            int n = isr.read();

            while (n != -1) {
                out += (char) n;
                n = isr.read();
            }
            return out;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addToFile(String fileName, String textToAdd) {
        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            byte[] buffer = textToAdd.getBytes(StandardCharsets.UTF_8);
            fos.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}