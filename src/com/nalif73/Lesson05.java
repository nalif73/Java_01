package com.nalif73;

public class Lesson05 {

    public static void main(String[] args) {

        Person40(newPerson(new Person[5]));

     }
     public static Person[] newPerson(Person[] persArray) {
         persArray[0] = new Person("Ivanov Ivan", "Engineer", "ii@mail.ru", "83548345678", 300000, 30);
         persArray[1] = new Person("Petrov Piter", "Consultant", "pp@mail.ru", "83348435678", 200120, 25);
         persArray[2] = new Person("Sidorov Andrey", "Director", "sa@mail.ru", "83848115600", 400875, 47);
         persArray[3] = new Person("Kuzhnetsova Svetlana", "Accountant", "ks@mail.ru", "87472115602", 380800, 42);
         persArray[4] = new Person("Galkina Olga", "Cleaner", "go@mail.ru", "81572825100", 100000, 20);
         return persArray;
     }
    public static void Person40 (Person[] persArray) {
        for (int i=0; i< persArray.length; i++) {
            if (persArray[i].ageVerification40()) persArray[i].printPerson();
        }
    }
}
