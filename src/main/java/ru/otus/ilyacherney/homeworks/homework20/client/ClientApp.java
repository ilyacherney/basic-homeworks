package ru.otus.ilyacherney.homeworks.homework20.client;

import java.io.IOException;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 8888);
        try {
            client.start();
        } catch (IOException e) {
            System.out.println("Ошибка клиента: " + e.getMessage());
        }
}
