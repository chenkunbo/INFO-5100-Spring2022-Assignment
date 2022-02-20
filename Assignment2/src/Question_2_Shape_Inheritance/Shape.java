package Question_2_Shape_Inheritance;

public class Shape {

    // 1. Fields: name, color, area, perimeter
    public String name;
    public String color;
    public double area;
    public double perimeter;

    // 2. Constructors
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Shape(String name, String color, double area, double perimeter){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    // 3. Methods
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void printShape(){
        System.out.println("*************");
        System.out.println("Name: " + name );
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }

}





