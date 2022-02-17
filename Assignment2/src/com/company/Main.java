package com.company;

import Question_1_Copy_Constructor.Student;
import Question_3_shapeTester.Circle;
import Question_3_shapeTester.Rectangle;
import Question_3_shapeTester.Shape;

public class Main {

    public static void main(String[] args) {

        // Question1: Implement given program using copy constructor by creating a class Student with two parameter
        // 1. int rollNumber; 2. String name
        System.out.println("Question1:");

        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+ student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());
        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+     student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());

        // Question3: Class shapeTester

        System.out.println("Question3 Test");

        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);

        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }






}


