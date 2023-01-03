public class Rectangle extends Shape{

    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double area(){
        return getB()*getA();
    }

    public double perimeter(){
        return 2*this.a+2*this.b;
    }
}
