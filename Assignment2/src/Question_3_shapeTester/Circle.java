package Question_3_shapeTester;

public class Circle extends Shape{

    public double radius;

    public Circle(double v){
        this.radius = radius;
    }

    public Circle(String name, double area, double perimeter, double radius) {
        super(name, area, perimeter);
        this.radius = radius;
    }


    public double computeArea() {
        return 3.14*radius*radius;

    }

    public double computePerimeter() {
        return 2*3.14*radius;
    }

    public void display(){

        System.out.println("Area : " + computeArea());
        System.out.println("Perimeter : " + computePerimeter());
    }

}
