package com.academy.telesens.lesson11;

import java.io.*;

public class FileExersise {
    public static void main(String[] args) {
        String path = "C:\\Telesens_lessons\\src\\com\\academy\\telesens\\lesson11\\женские имена2.txt";
        String pathR = "C:\\Telesens_lessons\\src\\com\\academy\\telesens\\lesson11\\женские имена.txt";

        try (FileWriter fw = new FileWriter(path, true);
                PrintWriter pw = new PrintWriter(fw);
                BufferedReader br = new BufferedReader(new FileReader(pathR)))
        {
            String line;
            while ((line = br.readLine()) != null)
                pw.println(line);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
