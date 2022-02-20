package com.company;

public class Professor extends Person{

    // 1. Fields
    public String quiz;

    // 2. Constructor
    public Professor(String quiz, String name, int id, int age) {
        super(name, id, age);
        this.quiz = quiz;
    }

    // 3. Function
    public void Quiz(){
        System.out.println("Give Quiz : ");
    }


}
