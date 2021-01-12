package com.nalif73;

public class Person {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson () {
        System.out.println("fullName: " + fullName + " position: " + position + " email: " + email + " phone: " +
                phone +  " salary: " + salary + " age: "  + age);
    }

    public boolean ageVerification40() {
            if (age>40) return true;
            return false;
    }
}
