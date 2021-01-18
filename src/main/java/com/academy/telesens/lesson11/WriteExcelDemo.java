package com.academy.telesens.lesson11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class WriteExcelDemo {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Complex Date");
        Object[][] date = {
                {1,"text_1", 1.1},
                {3,"text_3", 1.3},
                {5,"text_5", 1.5},
                {7,"text_7", 1.7},
                {9,"text_9", 1.9}
        };
        for (int r = 0; r < 5; r++) {
            Row row = sheet.createRow(r);
            Cell cellNumber = row.createCell(0);
            Cell cellText = row.createCell(1);
            Cell cellDouble = row.createCell(2);

            cellNumber.setCellValue((int)date[r][0]);
            cellText.setCellValue((String)date[r][1]);
            cellDouble.setCellValue((Double)date[r][2]);
        }
        try (FileOutputStream out = new FileOutputStream(new File("C:\\java-maven-1\\src\\main\\java\\com\\academy\\telesens\\lesson11\\saved.xlsx"))){
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
