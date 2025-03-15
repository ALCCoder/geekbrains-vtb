package com.xandrcompany;

import com.xandrcompany.homework.animals.Animal;
import com.xandrcompany.homework.animals.Dog;
import com.xandrcompany.homework.animals.HomeCat;
import com.xandrcompany.homework.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Bobik", "Black", 12);;
        animals[1] = new HomeCat("Murzik", "White", 5);
        animals[2] = new HomeCat("Pegas", "Yellow", 2);
        animals[3] = new Tiger("Sherhan", "White", 14);
        animals[4] = new Dog("Stephan", "Orange", 2);

        for(Animal animal: animals) {
            animal.swim(8);
            animal.run(444);
        }

        HomeCat homeCat = new HomeCat();
        System.out.println("Count of cat: " + homeCat.getCount());
    }
}