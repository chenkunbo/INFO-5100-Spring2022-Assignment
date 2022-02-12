package com.company;

// Question 10: Implement a class Box {double width; double height; double depth;}
// Initialize the value through constructor. Write a function to calculate the box volume.

public class Box {
    // private variables
    double _width;
    double _height;
    double _depth;

    // constructor
    public Box(double width, double height, double depth) {
        _width = width;
        _height = height;
        _depth = depth;
    }



    public void printBoxInfo() {
        System.out.println("*************");
        System.out.println("Box volume is : " + _width*_height*_depth);
    }


}
