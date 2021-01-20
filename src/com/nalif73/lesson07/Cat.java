package com.nalif73.lesson07;

public class Cat {
    private String name;
    private int appetite;
    private boolean full=false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        System.out.println("К тарелке подошел поесть кот " + name);
        p.decreaseFood(appetite, this);
    }
    public void setFull(boolean full) {
        this.full = full;
    }

    public void info() {
      if (full) System.out.println("Кот " + name + " сыт");
                   else System.out.println("Кот " + name + " голоден");
    }
    public String getName() {
        return name;
    }
}
