package ru.otus.ilyacherney.homeworks.homework27;

import javax.xml.transform.Source;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        char[] sequence = getSequence();
        char[] text = getFileText(file);
        int counter = countSequenceOccurrences(sequence, text);
        System.out.println("Последовательность втсречается " + counter + " раз.");
    }

    public static File getFile() {
        System.out.println("Введите имя файла:");
        Scanner scanner = new Scanner(System.in);
        String fileName = "file1.txt";
        return new File(fileName);
    }

    public static char[] getSequence() {
        System.out.println("Введите последовательность символов для подсчета:");
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        return sequence.toCharArray();
    }

    public static char[] getFileText(File file) throws IOException {
        List<Character> text = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int charAsInt;
            while ((charAsInt = reader.read()) != -1) {
                text.add((char) charAsInt);
            }
        }

        char[] charArr = new char[text.size()];
        for(int i = 0; i < text.size(); i++) {
            charArr[i] = text.get(i);
        }
        return charArr;
    }

    public static int countSequenceOccurrences(char[] sequence, char[] text) {
        int counter = 0;
        int textIndex = 0;
        int sequenceIndex = 0;

        for (textIndex = 0; textIndex < text.length; textIndex++) {
            if (sequence[sequenceIndex] == text[textIndex]) {
                if (sequenceIndex == sequence.length -1) {
                    counter++;
                    continue;
                }
                sequenceIndex++;
            } else {
                sequenceIndex = 0;
            }
        }
        return counter;
    }
}
