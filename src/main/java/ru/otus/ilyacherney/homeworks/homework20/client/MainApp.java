package ru.otus.ilyacherney.homeworks.homework20.client;

import java.net.Socket;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter smth");
            String userInput = scanner.nextLine();
            Socket socket = new Socket("localhost", 8888);
            PingClient pingClient = new PingClient(socket);
            pingClient.send(userInput.getBytes());
        } catch (
        UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
