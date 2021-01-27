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
        //System.out.println(records.size());

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
        System.out.println("*****************");
        //System.out.println(records.get(1).get(0).split(";"));
        String[]values3 = records.get(2).get(0).split(";");
        System.out.println(values3[0]);
        System.out.println(values3[1]);
        System.out.println(values3[2]);

    }
}
