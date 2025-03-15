package com.xandrcompany.homework.animals;

public class HomeCat extends Animal {

    private static int count;

    public HomeCat() {
        ++count;
    }

    public HomeCat(String name, String color, int age) {
        super(name, color, age);
        ++count;
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println("Very big distance " + name + " can't run it.");
            return;
        }
        System.out.println(name + "running " + length + " meters.");
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat " + name + " can't swim.");
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

    public int getCount() {
        return count;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HomeCat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HomeCat)) return false;
        HomeCat homeCat = (HomeCat) obj;
        return this.name.equals(homeCat.getName()) && this.color.equals(homeCat.getColor()) && this.age == homeCat.getAge();
    }

    @Override
    public int hashCode() {
        return this.name.length() * 71 + this.color.hashCode() * 31 + this.age + 12;
    }
}
