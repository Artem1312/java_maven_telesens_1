package com.academy.telesens.lesson_11.home_task;

import com.academy.telesens.Person.Gender;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class Demo {
    /*opensystem!

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
        Properties properties = new Properties();
        File file = new File("src/main/resources/java-part.properties");
        String path = "";
        String mans_name = "";
        String mans_surname = "";
        String women_name = "";
        String women_surname = "";

        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);
            path = properties.getProperty("subscriber.exc");
            mans_name = properties.getProperty("male.firstnames");
            mans_surname = properties.getProperty("male.lastnames");
            women_name = properties.getProperty("female.firstnames");
            women_surname = properties.getProperty("female.lastnames");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> name_man = new ArrayList<>();
        ArrayList<String> surname_man = new ArrayList<>();
        ArrayList<String> name_women = new ArrayList<>();
        ArrayList<String> surname_women = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(mans_name))){
            String line;
            while ((line = br.readLine())!=null)
                name_man.add(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader(mans_surname))){
            String line;
            while ((line = br2.readLine())!=null)
                surname_man.add(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br3 = new BufferedReader(new FileReader(women_name))){
            String line;
            while ((line = br3.readLine())!=null)
                name_women.add(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br4 = new BufferedReader(new FileReader(women_surname))){
            String line;
            while ((line = br4.readLine())!=null)
                surname_women.add(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers");

        Random random = new Random();
        Gender[] gender = new Gender[2000];
        int[] age = new int[2000];
        String[] operator = new String[2000];
        String[] phoneNumber = new String[2000];

        for (int i = 0; i < age.length ; i++) {
            age[i] = random.nextInt(90+1-5)+5;
        }

        for (int g = 0; g < gender.length; g++) {
            if(random.nextInt(2) == 0){
                gender[g] = Gender.MALE;
            } else { gender[g] = Gender.FEMALE;}
        }

        for (int i = 0; i < operator.length; i++) {
            if (random.nextInt(3) == 0){
                operator[i] = String.valueOf(MobileOperator.LIFE);
                if(random.nextInt(3) == 0) {
                    phoneNumber[i] = MobileOperator.LIFE.getFirstIndex()+ (random.nextInt(1000000)+999999);
                } else if (random.nextInt(3) == 1) {
                    phoneNumber[i] = MobileOperator.LIFE.getSecondIndex()+ (random.nextInt(1000000)+999999);
                } else {
                    phoneNumber[i] = MobileOperator.LIFE.getThirdIndex()+ (random.nextInt(1000000)+999999);
                }
            } else if (random.nextInt(3)==1){
                operator[i] = String.valueOf(MobileOperator.KIEVSTAR);
                if(random.nextInt(3) == 0) {
                    phoneNumber[i] = MobileOperator.KIEVSTAR.getFirstIndex()+ (random.nextInt(1000000)+999999);
                } else if (random.nextInt(3) == 1) {
                    phoneNumber[i] = MobileOperator.KIEVSTAR.getSecondIndex()+ (random.nextInt(1000000)+999999);
                } else {
                    phoneNumber[i] = MobileOperator.KIEVSTAR.getThirdIndex()+ (random.nextInt(1000000)+999999);
                }
            } else  {
                operator[i] = String.valueOf(MobileOperator.VODAFONE);
                if(random.nextInt(3) == 0) {
                    phoneNumber[i] = MobileOperator.VODAFONE.getFirstIndex()+ (random.nextInt(1000000)+999999);
                } else if (random.nextInt(3) == 1) {
                    phoneNumber[i] = MobileOperator.VODAFONE.getSecondIndex()+ (random.nextInt(1000000)+999999);
                } else {
                    phoneNumber[i] = MobileOperator.VODAFONE.getThirdIndex()+ (random.nextInt(1000000)+999999);
                }
            }
        }

        for (int r = 0; r < 2000; r++) {
            Row row = sheet.createRow(r);
            Cell cellIndex = row.createCell(0);
            Cell cellSecondName = row.createCell(1);
            Cell cellFirstName = row.createCell(2);
            Cell cellGender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellPhoneNumber = row.createCell(5);
            Cell cellOperator = row.createCell(6);

            cellIndex.setCellValue(r+1);
            cellAge.setCellValue(age[r]);
            cellOperator.setCellValue((String)operator[r]);
            cellPhoneNumber.setCellValue((String)phoneNumber[r]);

            if(gender[r] == Gender.MALE){
                cellGender.setCellValue( (String) "M");
                cellSecondName.setCellValue((String) name_man.get(random.nextInt(name_man.size()-1)));
                cellFirstName.setCellValue((String) surname_man.get(random.nextInt(surname_man.size()-1)));
            } else {
                cellGender.setCellValue((String)"F");
                cellSecondName.setCellValue((String) name_women.get( random.nextInt(name_women.size()-1)));
                cellFirstName.setCellValue((String) surname_women.get(random.nextInt(surname_women.size()-1)));
            }
        }

        try (FileOutputStream out = new FileOutputStream(new File(path))) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


