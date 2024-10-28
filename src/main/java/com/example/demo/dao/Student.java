package com.example.demo.dao;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;

    public Long getId() {
        return id;
    }

    @Column(name="age")
    private int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
