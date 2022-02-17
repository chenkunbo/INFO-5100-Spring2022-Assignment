package Question_2_Shape_Inheritance;

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

    public void side(){
        System.out.println("If the single side is given then all sides to the same value.");
    }

    // 3. Getters and Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 4. Override the getArea() and getPerimeter() getter methods of Shape to give desired output
    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }



}
