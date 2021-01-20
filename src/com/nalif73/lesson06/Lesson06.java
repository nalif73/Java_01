package com.nalif73.lesson06;

import java.util.Random;

public class Lesson06 {
    public static void main(String[] args) {
        Animals[] animals = {
                new Dog("Бобик"),
                new Cat("Мурзик"),
                new Dog("Рэкс"),
                new Cat("Барсик"),
                new Cat("Васька")
        };

        animalsRunSwim(animals);

        countAnimals(animals);
    }
    public static void countAnimals(Animals[] animals) {
        System.out.println("");
        System.out.println("Всего создано животных - " + animals.length);
        int countDog=0, countCat=0;
        for (int i=0; i<animals.length; i++)
        {
            if (animals[i] instanceof Dog) countDog++;
            else countCat++;
        }
        System.out.println("из них " + countDog + " собак и " + countCat + " котов");

    }

    public static void animalsRunSwim (Animals[] animals) {
        Random random = new Random();
        for (int i=0; i<animals.length; i++) {
            animals[i].run(random.nextInt(511));
            animals[i].swim(random.nextInt(15));
        }

    }

}
