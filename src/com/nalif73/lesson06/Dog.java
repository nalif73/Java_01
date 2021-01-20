package com.nalif73.lesson06;

public class Dog extends Animals {
    public Dog(String name) {
        super(name, 500, 10);
    }

    @Override
    public  void run(int dist) {
        if (dist<=getMaxRun())  System.out.println(getName()+ " пробежал " + dist + " м");
        else System.out.println(getName() +" так далеко не может бегать. Максимум " + getMaxRun() + " м");
    }
    @Override
    public  void swim(int dist) {
        if (dist<=getMaxSwim())
            System.out.println(getName()+ " проплыл " + dist + " м");
        else System.out.println(getName() +" так далеко не может плавать. Максимум " + getMaxSwim() + " м");
    }

}
