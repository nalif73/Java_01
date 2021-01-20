package com.nalif73.lesson07;

public class Lesson07 {
    public static void main(String[] args) {
            Plate plate = new Plate(100);
            Cat[] cat = {
                    new Cat("Барсик", 10),
                    new Cat("Васька", 12),
                    new Cat("Черныш", 25),
                    new Cat("Марсик", 55),
                    new Cat("Персик", 10),
                    new Cat("Яшка", 10)
            };
            plate.info();

          for (int i=0; i<cat.length; i++) {
              cat[i].eat(plate);
              cat[i].info();
              plate.info();
          }
        plate.addFood(67);
        plate.info();
        }



}
