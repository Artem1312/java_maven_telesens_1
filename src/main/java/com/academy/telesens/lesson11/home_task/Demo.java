package com.academy.telesens.lesson11.home_task;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class Demo {
    /*

2) Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными:
	(путь к файлу взять из 'java-part.properties')
	a) Наполнить таблицу абонентов excel(2000 строк):
		- имена фамилии взять в соответстсвующих файлах (см. 'java-part.properties') со списком имен/фамилий (женских/мужских);
		- возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
			(диапазон брать из файла 'java-part.properties')

	b)  Телефонные номера для каждого оператора со следующими префиксами:
		- Life номера с префиксами: 38063*******, 38093*******, 38073*******
		- Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
		- Vodafone номера с префиксами: 38050*******, 38066*******, 38095*******

	Результат subscribers.xlsx должен выглядеть так:
		   1 | Васильев  | Иван | м | 23 | 380630025465 | Life
		   2 | Петрова   | Катя | ж | 34 | 380670058694 | Kievstar
		...
		2000 | Борисов   | Коля | м | 48 | 380500025465 | Vodafone
		Всего 200 случайных строк

	с) Реализовать класс Subscriber с приватными полями:
		- private Long id;
		- private String firstName;
		- private String lastName;
		- private Gender gender; // создать перечисление Gender для мужского и женского пола
			- 'MALE'
			- 'FEMALE'
		- private int age;
		- private String phoneNumber;
		- private Operator operator;
				private Long id;
				private String name;

	d) Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt
		(путь к файлу взять из 'java-part.properties')

	e) Прочитать subscribers.xlsx в коллекцию List<Subscriber> отсортировать сразу по 4 полям:
		- оператору
		- по возрасту
		- по фамилии
		- по имени

	f) Сохранить результат сортировки в файл 'sort-subscribers.txt'
		(путь к файлу взять из 'java-part.properties')


	g) Прочитать 1-ый десять строк файла sort-subscribers.txt и вывести на экран
		(путь к файлу взять из 'java-part.properties')


3) Написать Java приложение, которое наполнит файл subscribers.txt, случайными данными (Абонентами):
	(путь к файлу взять из 'java-part.properties' по ключу 'subscriber.txt')
	a) Реализовать класс Operator с приватными полями:
				private Long id;
				private String name;
	b) Реализовать класс Subscriber с приватными полями:

		- private Long id;
		- private String firstName;
		- private String lastName;
		- private Gender gender; // создать перечисление Gender для мужского и женского пола
			- 'MALE'
			- 'FEMALE'
		- private int age;
		- private String phoneNumber;
		- private Operator operator;
				private Long id;
				private String name;
	c) Наполнить текстовый файл 'subscribers.txt'(200 строк):
		- имена и фамилии брать в случайном порядке в соответстсвующих файлах (см. 'java-part.properties') со списком имен/фамилий (женских/мужских);
		- возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
			(диапазон брать из файла 'java-part.properties')

	b)  Телефонные номера для каждого оператора со следующими префиксами:
		- Life номера с префиксами: 38063*******, 38093*******, 38073*******
		- Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
		- Vodafone номера с префиксами: 38050*******, 38066*******, 38095*******

	Результат subscribers.txt должен выглядеть так:
		   1,Васильев,Иван,м,23,380630025465,Life
		   2,Петрова,Катя,ж,34,380670058694,Kievstar
		...
		   200,Борисов, Коля,м,48,380500025465,Vodafone
		Всего 200 случайных строк


	d) Прочитать subscribers.txt в коллекцию Map<Long, Subscriber> и вывести на экран из коллекции Map
		(путь к файлу взять из 'java-part.properties')

	e) Прочитать subscribers.txt в коллекцию List<Subscriber> отсортировать сразу по 4 полям:
		- оператору
		- по возрасту
		- по фамилии
		- по имени

	f) Сохранить результат сортировки в файл 'sort-subscribers.txt'
		(путь к файлу взять из 'java-part.properties')


	g) Прочитать 1-ые 50 строк файла sort-subscribers.txt и вывести на экран
		(путь к файлу взять из 'java-part.properties')

4)  При генерации случайных абонентов из предыдущих заданий, сохранять в лог файл
		информацию о каждом новом сгенерированном абоненте. В логгер должна попасть информация:
			дата записи
			класс, из которого произошла запись
			номер строки кода
			информация о само абоненте (взять через toString())
     */
    public static void main(String[] args) {

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Persons");
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);

        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        //headerStyle.setFillForegroundColor(IndexedColors.LIGHT__BLUE.getIndex());
        //headerStyle.setFillPattern(FillPatternType.SOLID__FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Name");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Age");
        headerCell.setCellStyle(headerStyle);

        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        Row row = sheet.createRow(2);
        Cell cell = row.createCell(0);
        cell.setCellValue("John Smith");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue(20);
        cell.setCellStyle(style);

        //File currDir = new File(".");
        File currDir = new File("C:/java-maven-1/src/main/java/com/academy/telesens/lesson11/home_task/");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "temp.xlsx";

//        FileOutputStream outputStream = new FileOutputStream(fileLocation);
//        workbook.write(outputStream);
//        workbook.close();



    }
}
