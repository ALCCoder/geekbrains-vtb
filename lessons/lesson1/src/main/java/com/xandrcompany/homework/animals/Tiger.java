package com.xandrcompany.homework.animals;

public class Tiger extends Animal {

    private static int count;

    public Tiger() {
        ++count;
    }

    public Tiger(String name, String color, int age) {
        super(name, color, age);
        ++count;
    }

    @Override
    public void run(int length) {
        if (length > 700) {
            System.out.println("Very big distance " + name + " can't run it.");
            return;
        }
        System.out.println(name + " running " + length + " meters.");
    }

    @Override
    public void swim(int length) {
        if (length > 40) {
            System.out.println("Very big distance!!! " + name + "can't swim it.");
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
        return "Tiger{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Tiger)) return false;
        Tiger tiger = (Tiger) obj;
        return this.name.equals(tiger.getName()) && this.color.equals(tiger.getColor()) && this.age == tiger.getAge();
    }

    @Override
    public int hashCode() {
        return this.name.length() * 12 + this.color.hashCode() * 33 + this.age + 8;
    }
}
