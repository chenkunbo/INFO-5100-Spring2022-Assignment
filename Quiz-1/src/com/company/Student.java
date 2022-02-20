package com.company;

import java.util.ArrayList;

public class Student extends Person{

    // 1. Fields
    public String takeQuiz;
    private ArrayList<Student> students;

    // 2. Constructor
    public Student(String name, int id, int age) {
        super(name, id, age);

    }


    public String getTakeQuiz() {
        return takeQuiz;
    }

    public void setTakeQuiz(String takeQuiz) {
        this.takeQuiz = takeQuiz;
    }

    // 3. Function
    public void takeQuiz(Professor professor){
        System.out.println("Student" + this.getName() + "finished Quiz" + takeQuiz);
    }

    public void subscribe(Professor professor){
        this.takeQuiz = takeQuiz;
        if(! professor.students.contains(this)){
            this.students = new ArrayList<>();
        }
    }

    public void unsubscribe(Professor professor){
        this.takeQuiz = takeQuiz;
        professor.students.remove(this);

    }

}


