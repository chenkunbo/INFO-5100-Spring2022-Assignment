package Question_2_Classes_Constructor;

public class Triangle extends Shape{

    // 1. Fields: base, height
    public double base;
    public double height;

    // 2. Constructor
    public Triangle(String name, String color, double area, double perimeter, double base, double height) {
        super(name, color, area, perimeter);
        this.base = base;
        this.height = height;
    }





}
