package app.service.impl;

import app.service.Animals;

public class Dog implements Animals {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void yell() {
        System.out.println("汪汪汪");
    }
}
