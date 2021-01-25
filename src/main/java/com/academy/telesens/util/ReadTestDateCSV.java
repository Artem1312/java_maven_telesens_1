package com.academy.telesens.util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadTestDateCSV <T extends Object> {

    String pathDate;
    String sheetName;
    int column;
    int row;

    public ReadTestDateCSV(String pathDate, String sheetName, int column, int row) {
        this.pathDate = pathDate;
        this.sheetName = sheetName;
        this.column = column;
        this.row = row;
    }

    public String getPathDate() {
        return pathDate;
    }

    public void setPathDate(String pathDate) {
        this.pathDate = pathDate;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "ReadTestDateCSV{" +
                "pathDate='" + pathDate + '\'' +
                ", sheetName='" + sheetName + '\'' +
                ", column=" + column +
                ", row=" + row +
                '}';
    }

//    public getData( String pathDate, String sheetName, int column, int row){
//        <T> data;
//        File file = new File(pathDate);
//        try(XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))){
//            XSSFSheet sheet = workbook.getSheet(sheetName);
//            data = sheet.getRow(row).getCell(column);
//        }
//        return <T> data;
//    }
}
