package com.company;

public class Student extends Person{

    // 1. Fields
    public String takeQuiz;

    // 2. Constructor
    public Student(String takeQuiz, String name, int id, int age) {
        super(name, id, age);
        this.takeQuiz = takeQuiz;
    }

    // 3. Function
    public void takeQuiz(){
        System.out.println("Take Quiz : ");
    }

}
