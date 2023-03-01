package ru.alishev.springcourse.models;

public class Person {
    private int id;
    private String name;
    private String email;
    private int age;

    public Person(int i, String s, int i1, String s1) {
        this.id = i;
        this.name = s;
        this.age = i1;
        this.email = s1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
