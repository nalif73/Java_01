package com.nalif73.lesson06;

public class Cat extends Animals {
    public Cat(String name) {
        super(name, 200, 0);
    }
    @Override
    public  void run(int dist) {
        if (dist<=getMaxRun())
            System.out.println(getName()+ " пробежал " + dist + " м");
        else System.out.println(getName() +" так далеко не может бегать. Максимум " + getMaxRun() + " м");
    }
    @Override
    public  void swim(int dist) {
        System.out.println(getName() + " не умеет плавать");
    }
}
