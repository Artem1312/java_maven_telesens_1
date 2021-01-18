package com.academy.telesens.lesson11.home_task;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Properties;

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
        /*
        2) Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными:

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
         */
        Properties properties = new Properties();
        File file = new File("src/main/resources/java-part.properties");
        String path = "";
        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);
            path = properties.getProperty("subscriber.exc");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers");
        Object[][] date = {
                {1,"Васильев", "Иван", "m", 23, "380630025465", "Life"},
                {1,"Васильев", "Иван", "m", 23, "380630025465", "Life"}
        };
        for (int r = 0; r < 2; r++) {
            Row row = sheet.createRow(r);
            Cell cellIndex = row.createCell(0);
            Cell cellSecondName = row.createCell(1);
            Cell cellFirstName = row.createCell(2);
            Cell cellGender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellPhoneNumber = row.createCell(5);
            Cell cellOperator = row.createCell(6);
            
            cellIndex.setCellValue((int)date[r][0]);
            cellSecondName.setCellValue((String) date[r][1]);
            cellFirstName.setCellValue((String)date[r][2]);
            cellGender.setCellValue((String)date[r][3]);
            cellAge.setCellValue((int)date[r][4]);
            cellPhoneNumber.setCellValue((String)date[r][5]);
            cellOperator.setCellValue((String)date[r][6]);
        }
        try (FileOutputStream out = new FileOutputStream(new File(path))) { 
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
