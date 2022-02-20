package com.company;

import java.util.ArrayList;

public class Professor extends Person{

    // 1. Fields
    public String quiz;

    ArrayList<Student> students;

    // 2. Constructor
    public Professor(String name, int id, int age) {
        super(name, id, age);
        this.quiz = quiz;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    // 3. Function
    //public void giveQuiz(String quiz){
    //    System.out.println("Professor" + this.getQuiz() + "published Quiz" + quiz);
    //}


    public void giveQuiz(String quiz){
        this.quiz = quiz;
        for(Student students: students){
            students.takeQuiz(this);

        }
    }



}
