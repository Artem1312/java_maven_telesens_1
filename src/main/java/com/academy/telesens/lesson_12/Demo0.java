package com.academy.telesens.lesson_12;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo0 {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet =  workbook.createSheet("test");
        Row row = sheet.createRow(0);
        Cell cell1 = row.createCell(0);
        Cell cell2 = row.createCell(1);
        Cell cell3 = row.createCell(2);

        cell1.setCellValue("hello");
        cell2.setCellValue("World!");
        cell3.setCellValue(12);


        Row row1 = sheet.createRow(1);
        Cell cell4 = row1.createCell(0);
        Cell cell5 = row1.createCell(1);
        Cell cell6 = row1.createCell(2);

        cell4.setCellValue("hello!!!");
        cell5.setCellValue("World!!!");
        cell6.setCellValue(122);

        //запись на диск
        String path = "C:\\java-maven-1\\src\\main\\java\\com\\academy\\telesens\\lesson12\\demo.xlsx";

        try {
            OutputStream os = new FileOutputStream(path);
            workbook.write(os);
            workbook.close();
            os.close();

        } catch (Exception e) {
            System.out.println("Oшибка записи");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
