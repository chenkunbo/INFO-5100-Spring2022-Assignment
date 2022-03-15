package com.company;

public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment department1 = new SeattlePoliceDepartment("Seattle Police Department");
        Person citizen1 = new Person("AA", 20);
        Person citizen2 = new Person("BB", 21);
        Person citizen3 = new Person("CC", 22);

        citizen1.subscribe(department1);
        citizen2.subscribe(department1);
        citizen3.subscribe(department1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        department1.NotifyCitizens("Message 1");

        citizen1.unsubscribe(department1);
        citizen2.unsubscribe(department1);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        department1.NotifyCitizens("Message 2");
    }
}
