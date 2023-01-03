public class Circle extends Shape{

    private double r;


    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return this.r*this.r*3.14;
    }

    public double perimeter(){
        return 2*3.14*this.r;
    }
    
}
