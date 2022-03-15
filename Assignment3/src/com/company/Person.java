package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getNotification(SeattlePoliceDepartment seattlePoliceDepartment) {
        System.out.println("-----------");
        System.out.println("Notification: " + seattlePoliceDepartment.getDepartmentName());
        System.out.println("Citizen Name: " + this.getName());
        System.out.println("News: " + seattlePoliceDepartment.newsName);
        System.out.println("-----------");
    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment) {
        if (!seattlePoliceDepartment.person.contains(this)) {
            seattlePoliceDepartment.person.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment seattlePoliceDepartment) {
        seattlePoliceDepartment.person.remove(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
