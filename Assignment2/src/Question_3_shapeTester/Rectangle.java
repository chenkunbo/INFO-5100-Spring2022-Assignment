package Question_3_shapeTester;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, double area, double perimeter, double length, double width) {
        super(name, area, perimeter);
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return length*width;
    }

    public double computePerimeter() {
        return 2*(length+width);
    }

    public void display(){
        System.out.println("Name : " + new Shape());
        System.out.println("Area : " + computeArea());
        System.out.println("Perimeter : " + computePerimeter());
    }

}
