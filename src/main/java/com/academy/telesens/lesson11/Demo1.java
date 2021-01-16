package com.academy.telesens.lesson11;

import java.io.*;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String path = "C:\\Telesens_lessons\\src\\com\\academy\\telesens\\lesson11\\женские имена.txt";
        //String pathOut = "C:\\Telesens_lessons\\src\\com\\academy\\telesens\\lesson11\\женские имена2.txt";




//        InputStream is = null;
//        try {
//            is = new FileInputStream(path);
//            Scanner scanner = new Scanner(is);
//            String line = scanner.nextLine();
//            System.out.println(line);
//            System.out.println(scanner.nextLine());
//            is.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

        try (InputStream is = new FileInputStream(path)){
      
            Scanner scanner = new Scanner(is);

            while (scanner.hasNext()){
                    String line = scanner.nextLine();
                System.out.println(line);
            }

            //String line = scanner.nextLine();
            //System.out.println(line);
            //System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
                   e.printStackTrace();
                 } catch (IOException e) {
                      e.printStackTrace();
                  }

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
            System.out.println(line);
            }
        
            //String line = br.readLine();
            //System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
