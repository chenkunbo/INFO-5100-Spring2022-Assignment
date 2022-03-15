package com.company;

public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment department1 = new SeattlePoliceDepartment("Seattle Police Department");
        Person citizen1 = new Person("Ashish", 20);
        Person citizen2 = new Person("Bob", 21);
        Person citizen3 = new Person("Gabby", 22);

        citizen1.subscribe(department1);
        citizen2.subscribe(department1);
        citizen3.subscribe(department1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        department1.NotifyCitizens("Shot fired in tacoma yesterday night.");

        citizen1.unsubscribe(department1);
        citizen2.unsubscribe(department1);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        department1.NotifyCitizens("Covid-19 reported in Seattle uptown apartment");
    }
}
