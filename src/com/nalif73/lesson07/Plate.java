package com.nalif73.lesson07;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, Cat cat) {
        if ((food-n)>=0) {
               food-=n; cat.setFull(true);
              }
              else {
              System.out.println("Еды в тарелке меньше, чем аппетит кота " + cat.getName() + ", он не поел");
              cat.setFull(false);
              }

    }
    public void info() {
        System.out.println("В тарелке " + food + " единиц еды");
    }
    public void addFood (int food) {
        System.out.println("Добавляем еду в тарелку...");
        this.food+=food;
    }

}
