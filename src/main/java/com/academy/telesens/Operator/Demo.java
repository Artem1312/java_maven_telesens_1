package com.academy.telesens.Operator;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        Subscriber [] subs = new Subscriber[100];

        int[] age = new int[100];
        char[] gender = new char[100];

        for (int i = 0; i < age.length ; i++) {
            age[i] = random.nextInt(90+1-4)+4;
        }

        for (int g = 0; g < gender.length; g++) {
            if(random.nextInt(2) == 0){
                gender[g] = 'm';
            } else { gender[g] = 'f';}
        }
        //System.out.println(Arrays.toString(age));
        //System.out.println(Arrays.toString(gender));

        String[] manSurname = {"Смирнов","Иванов","Кузнецов","Попов","Соколов","Лебедев","Козлов","Новиков","Морозов",
                "Петров","Волков","Соловьёв","Васильев","Зайцев","Павлов"};
        String[] manName = {"Архип","Болеслав","Марат","Семён","Юлиан","Сергей","Нифонт","Максим","Евгений","Геннадий",
                "Володар","Ждан","Марк","Григорий","Леонид","Олег"};
        String[] femaleSurname = {"Ковалёва","Ильина","Гусева","Титова","Кузьмина","Кудрявцева","Баранова","Куликова",
                "Алексеева","Степанова","Яковалева","Сорокина","Сергеева","Романова","Захарова","Борисова"};
        String[] femaleName = {"Виктория","Дария","Арина","Зоя","Лиза","Мария","Надя","Раиса","Тамара","Октябрина","Рая",
                "Роза","Нелли","Милана","Любовь","Леся","Каролина","Зинаида","Карина","Клавдия"};

        for (int j = 0; j < subs.length ; j++) {
            subs[j] = new Subscriber(); // надо явно создать объект для каждой ячейки
            if(gender[j] == 'm'){
                subs[j].setFirstName(manName[random.nextInt(manName.length)]);
                subs[j].setLastName(manSurname[random.nextInt(manSurname.length)]);
            } else {
                subs[j].setFirstName(femaleName[random.nextInt(femaleName.length)]);
                subs[j].setLastName(femaleSurname[random.nextInt(femaleSurname.length)]);
            }
            subs[j].setGender(gender[j]);
            subs[j].setAge(age[j]);
        }

        for (int h = 0; h < subs.length; h++) {
            subs[h].getProfile();
        }
    }
}
