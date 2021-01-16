package com.academy.telesens.Person.Demo;

import com.academy.telesens.Person.*;

import java.util.Random;


public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        Boxer boxer = new Boxer();
        Programmer programmer = new Programmer();
        Tester tester = new Tester();
        Choreograph choreograph = new Choreograph();
        Genious genious = new Genious();


        Person[] group = new Person[20];
        Person obj = null;
        Random random = new Random();

        for (int j = 0; j < group.length; j++) {
            int randomNum = random.nextInt(5);
            switch (randomNum){
                case 0:
                    obj = new Boxer();
                    break;
                case 1:
                    obj = new Programmer();
                    break;
                case 2:
                    obj = new Tester();
                    break;
                case 3:
                    obj = new Choreograph();
                    break;
                case 4:
                    obj = new Genious();
                    break;
            }
            group[j] = obj;
        }

        int countBoxer = 0;
        int countProgrammer = 0;
        int countTester = 0;
        int countChoreograph = 0;
        int countGenious = 0;

        for (int i = 0; i < group.length; i++) {
            if(group[i] instanceof Boxer){countBoxer++;}
            else if(group[i] instanceof Programmer){countProgrammer++;}
            else if(group[i] instanceof Tester){countTester++;}
            else if(group[i] instanceof Choreograph){countChoreograph++;}
            else if(group[i] instanceof Genious){countGenious++;}
        }

        System.out.println("Количество Boxer: "+countBoxer);
        System.out.println("Количество Programmer: "+countProgrammer);
        System.out.println("Количество Tester: "+countTester);
        System.out.println("Количество Choreograph: "+countChoreograph);
        System.out.println("Количество Genious: "+countGenious);
    }
}
