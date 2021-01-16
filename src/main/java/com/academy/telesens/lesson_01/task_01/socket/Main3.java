package com.academy.telesens.lesson_01.task_01.socket;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, XMLStreamException, SAXException, TransformerException {
        URLConnection connection = new URL("http://qa3.trueconf.net").openConnection();
//        Scanner scanner = new Scanner(connection.getInputStream());
//        scanner.useDelimiter("\\Z");            //без нее возвращается только <!doctype
//        System.out.println(scanner.next());

//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        for(Map.Entry<String, List<String>> entry : headerFields.entrySet()){
            System.out.println(entry.getKey() + "/"+ entry.getValue());
        }

    }
}
