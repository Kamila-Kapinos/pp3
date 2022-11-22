public class SurfaceArea
{
    // final static double PI = 3.14;
    
    public static double circleArea(double r){
        return Math.round(r* r * Math.PI * 100)/100.0;
    }
    
    
    public static double rectangleArea(double a, double b){
        return a * b;
    }
    
    public static double triangleArea(double a, double h){
        return a * h * 0.5;
    }
 
    
    public static void main(String[] args){
    
        System.out.println(circleArea(2));
        System.out.println(rectangleArea(2, 4));
        System.out.println(triangleArea(4, 5));
    }
}
