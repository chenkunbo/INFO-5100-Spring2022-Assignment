package Main;

import Question_1_Copy_Constructor.Student;

public class Main {

    public static void main(String[] args) {

        // Question1: Implement given program using copy constructor by creating a class Student with two parameter
        // 1. int rollNumber; 2. String name

        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+ student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());
        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+     student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());

    }
}

