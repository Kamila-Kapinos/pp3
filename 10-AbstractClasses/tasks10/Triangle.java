public class Triangle extends Shape {

    private double x;
    private double y;
    private double z;
    private double h;


    public Triangle(double x, double y, double z, double h) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
    }


    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double area(){
        return getX()*getH()*0.5;
    }

    public double perimeter(){
        return this.x+this.y+this.z;
    }
    
}
