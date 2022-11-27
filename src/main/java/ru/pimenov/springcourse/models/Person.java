package ru.pimenov.springcourse.models;

import jakarta.validation.constraints.Email;

public class Person {
    private int id;
    private String name;
    private int age;
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        // почему-то идея не позволяет аннотировать
//        @NotEmpty(message = "Name should not be empty")
//        @Size(min = 2, max = 30, message = "Name should be beetwen 2 and 30 characters")
        this.name = name;
//        @Min(value = 0, message = "Age should be greater then 0")
        this.age = age;
//        @NotEmpty(message = "Email should not be empty")
//        @Email(message = "Email should be valid")
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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
