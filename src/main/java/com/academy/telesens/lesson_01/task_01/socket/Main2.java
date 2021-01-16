package com.academy.telesens.lesson_01.task_01.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException{
        try(ServerSocket serverSocket = new ServerSocket(8189);
            Socket socket = serverSocket.accept()){
            //InputStream inputStream = socket.getInputStream();
            //OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            //printWriter.println("Hello ");
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                printWriter.println("You've send: "+ str);
                System.out.println(str);
                if(str.equals("exit")){
                    break;
                }
            }
        }
    }
}
