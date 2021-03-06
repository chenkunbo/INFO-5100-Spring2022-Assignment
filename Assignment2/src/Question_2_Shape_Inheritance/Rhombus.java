package Question_2_Shape_Inheritance;

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

    public void diagonal_d1(){
        System.out.println("both diagonals have the same length");
    }

    // 3. Getters and Setters
    public double getDiagonal_d1() {
        return diagonal_d1;
    }

    public void setDiagonal_d1(double diagonal_d1) {
        this.diagonal_d1 = diagonal_d1;
    }

    public double getDiagonal_d2() {
        return diagonal_d2;
    }

    public void setDiagonal_d2(double diagonal_d2) {
        this.diagonal_d2 = diagonal_d2;
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
