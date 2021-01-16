package com.academy.telesens.lesson_01.task_01.socket;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException {
        //india.colorado.edu:13
        try(Socket socket = new Socket()){
            byte[] ipAddr = new byte[] {(byte) 192, (byte) 168, 0, 103 };
            socket.connect(new InetSocketAddress(InetAddress.getByAddress("aa116.trueconf.name", ipAddr), 4307), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }
}