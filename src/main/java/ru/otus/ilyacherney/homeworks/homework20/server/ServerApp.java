package ru.otus.ilyacherney.homeworks.homework20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);



        while (true) {
            Socket clientSocket = serverSocket.accept(); //todo почему остальные строки не выполняются пока не выполнится accept()?
            System.out.println("connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String str = in.readLine();
            System.out.println(str);
        }
    }
}

