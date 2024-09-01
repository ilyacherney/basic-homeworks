package ru.otus.ilyacherney.homeworks.homework20.client;

import java.io.*;
import java.net.Socket;

public class Client {
    private final String host;
    private final int port;

    public Client(String host, int port) throws IOException {
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException {
        try (Socket socket = new Socket(host, port)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())) {

                System.out.println("Подключен к серверу. Введите сообщение для отправки:");

                String message;
                while ((message = in.readLine()) != null) {
                    send(out, message);
                }
        } catch (IOException e) {
                System.out.println(e.);
            }
    }

    public void send(BufferedWriter out, String message) throws IOException {
        out.write(message);
        out.flush();
    }

}
