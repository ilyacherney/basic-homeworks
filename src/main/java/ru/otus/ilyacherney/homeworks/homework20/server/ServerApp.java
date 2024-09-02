package ru.otus.ilyacherney.homeworks.homework20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ServerApp {
    public static void main (String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);



        while (true) {
            Socket clientSocket = serverSocket.accept(); //todo почему остальные строки не выполняются пока не выполнится accept()?
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            System.out.println("Connected");
            out.write("Доступные операции: +, -, *, /" + "\n");
            out.flush();


            String str = in.readLine();
            String[] arr = str.split(" ");
            MathOperation mathOperation = new MathOperation(arr);
            int result = mathOperation.execute();
            System.out.println("result: " + result);
            out.write("Результат: " + result + "\n");
            out.flush();
        }
    }
}

