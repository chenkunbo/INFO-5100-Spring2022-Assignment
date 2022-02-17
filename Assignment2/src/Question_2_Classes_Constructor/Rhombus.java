package Question_2_Classes_Constructor;

public class Rhombus extends Shape{

    // 1. Fields: diagonal d1, diagonal d2
    public double diagonal_d1;
    public double diagonal_d2;

    // 2. Constructor
    public Rhombus(String name, String color, double area, double perimeter, double diagonal_d1, double diagonal_d2) {
        super(name, color, area, perimeter);
        this.diagonal_d1 = diagonal_d1;
        this.diagonal_d2 = diagonal_d2;
    }




}
