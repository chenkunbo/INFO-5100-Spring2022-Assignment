package com.company;

import Question_1.Student;

public class Main {

    public static void main(String[] args) {

        //Question_1
        Student sample = new Student();
        Student kunbo = new Student(sample);
        kunbo.setName("Kunbo");
        kunbo.setStudentID(007);

        Student gabby = new Student(sample);
        gabby.setName("Gabby");
        gabby.setStudentID(8);


    }

}
