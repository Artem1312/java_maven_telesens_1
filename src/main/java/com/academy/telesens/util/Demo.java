package com.academy.telesens.util;

import com.academy.telesens.util.PropertiesProvider;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {

//        String email1 = "";
//        String email2 = "";
//        String email3 = "";
//        String passw1 = "";
//        String passw2 = "";
//        String passw3 = "";
//        String answer1 = "";
//        String answer2 = "";
//        String answer3 = "";
//
//        File file = new File(PropertiesProvider.get("automation.auth.invalid.data.csv"));
//        try(XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))){
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            email1 = sheet.getRow(0).getCell(0).getStringCellValue();
//            email2 = sheet.getRow(1).getCell(0).getStringCellValue();
//            email3 = sheet.getRow(2).getCell(0).getStringCellValue();
//
//            passw1 = sheet.getRow(0).getCell(1).getStringCellValue();
//            passw2 = sheet.getRow(1).getCell(1).getStringCellValue();
//            passw3 = sheet.getRow(2).getCell(1).getStringCellValue();
//
//            answer1 = sheet.getRow(0).getCell(2).getStringCellValue();
//            answer2 = sheet.getRow(1).getCell(2).getStringCellValue();
//            answer3 = sheet.getRow(2).getCell(2).getStringCellValue();
//
//            System.out.println(email1);
//            System.out.println(passw1);
//            System.out.println(answer1);
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        File file = new File(PropertiesProvider.get("automation.auth.invalid.data.csv"));

        Reader in = new FileReader(file);

        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file));) {
            String[]values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }


        System.out.println(records.size());

        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(records.get(i).get(0).split(";")[j]);
            }

        }

        System.out.println("*****************");
        String[]values1 = records.get(0).get(0).split(";");
        //System.out.println(records.get(0).get(0).split(";"));
        System.out.println(values1[0]);
        System.out.println(values1[1]);
        System.out.println(values1[2]);
        System.out.println("*****************");
        //System.out.println(records.get(1).get(0).split(";"));
        String[]values2 = records.get(1).get(0).split(";");
        System.out.println(values2[0]);
        System.out.println(values2[1]);
        System.out.println(values2[2]);


//        CSVFormat records = new CSVFormat.EXCEL.parse(in);
//        //System.out.println(records.get(0).split(";")[0]);
//        for (int i = 0; i < records.size(); i++) {
//            System.out.println(records.get(i).split(";"));
//        }
//        for (CSVRecord record : records) {
//            //System.out.println(record.get(0));
//            String email1 = record.get(0).split(";")[0];
//            String email2 = record.get(0).split(";")[1];
//            String email3 = record.get(0).split(";")[2];
////            String passw1 = record.get(1).split(";")[0];
////            String passw2 = record.get(1).split(";")[1];
////            String passw3 = record.get(1).split(";")[2];
////            String answer1 = record.get(2).split(";")[0];
////            String answer2 = record.get(2).split(";")[1];
////            String answer3 = record.get(2).split(";")[2];
//            System.out.println(email1);
//            System.out.println(email2);
//            System.out.println(email3);
////            System.out.println(passw1);
////            System.out.println(passw2);
////            System.out.println(passw3);
////            System.out.println(answer1);
////            System.out.println(answer2);
////            System.out.println(answer3);
//
//            //System.out.println(Arrays.toString(new String[]{record.get(0).split(";")[0]}));
//
//        }

    }
}
