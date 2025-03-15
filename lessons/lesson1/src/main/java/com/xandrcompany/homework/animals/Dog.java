package com.xandrcompany.homework.animals;

public class Dog extends Animal {

    private static int count;

    public Dog() {
        ++count;
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
        ++count;
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println("Very big distance!!! " + name + " can't run it.");
            return;
        }
        System.out.println(name + " running " + length + " meters.");
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Very big distance " + name + " can't swim it.");
            return;
        }
        System.out.println(name + " swimming " + length + " meters.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        Dog dog = (Dog) obj;
        return this.name.equals(dog.getName()) && this.color.equals(dog.getColor()) && this.age == dog.getAge();
    }

    @Override
    public int hashCode() {
        return this.name.length() * 45 + this.color.hashCode() * 10 + this.age + 11;
    }
}