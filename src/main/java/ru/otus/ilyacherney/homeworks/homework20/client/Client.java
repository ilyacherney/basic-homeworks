package ru.otus.ilyacherney.homeworks.homework20.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final String host;
    private final int port;

    public Client(String host, int port) throws IOException {
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException {
        try (Socket socket = new Socket(host, port)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            receive(in); //Получить доступные операции

            send(out, getUserInput());

            receive(in);
        } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }

    public String getUserInput() {
        System.out.println("Введите операцию: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void send(BufferedWriter out, String message) throws IOException {
        out.write(message);
        out.newLine();
        out.flush();
    }

    public void receive(BufferedReader in) throws IOException {
        System.out.println(in.readLine());
    }

}
