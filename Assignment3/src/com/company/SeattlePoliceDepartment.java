package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    String departmentName;
    String newsName;
    ArrayList<Person> person;

    public void NotifyCitizens(String newsName) {
        this.newsName = newsName;
        for (Person citizen : person) {
            citizen.getNotification(this);
        }
    }

    public SeattlePoliceDepartment(String departmentName) {
        this.departmentName = departmentName;
        this.person = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
}
