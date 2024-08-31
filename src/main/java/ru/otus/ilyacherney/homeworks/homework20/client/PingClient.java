package ru.otus.ilyacherney.homeworks.homework20.client;

import java.io.*;
import java.net.Socket;

public class PingClient {
    private DataInputStream dis;
    private DataOutputStream dos;

    public PingClient (Socket socket) throws IOException {
        this.dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(byte[] bytes) throws IOException {
        dos.write(bytes);
        dos.flush();
    }
}
