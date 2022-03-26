package com.company;

import Question_1.Student;
import Question_3.Happy;
import Question_3.Moody;
import Question_3.Sad;
import Question_5.Camera;

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


        //Question_3
        Moody mood = new Moody() {
            @Override
            public void examine(String Mood) {}

            @Override
            public void observe(String Mood) {}
        };

        Moody sad = new Sad(" ", " ");
        Moody happy = new Happy(" ", " ");

        System.out.println();


        //Question_5
        Camera cam1 = Camera.getInstance();

        cam1.setCameraName("Camera 1");

        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());


    }

}
