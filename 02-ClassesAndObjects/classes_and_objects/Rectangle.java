public class Rectangle{
    
    //atrybuty
    
    double a;
    double b;
    //double dimension;
    //double surfaceArea;
    
    //metody
    
    public double calculateArea(){
        double surfaceArea = this.a * this.b;
        return surfaceArea;
    }
    
    public double calculateDim(){
        double dimension = 2 * this.a + 2 * this.b;
        return dimension;
    }
    
    public void displayData(){
    
        System.out.println("The rectangle data:" + "\nParimeters: "+ a + "x" + b 
        + "\nThe dimension: " + calculateDim() + "\nThe surface area: " + 
        calculateArea());
    }
    
    
    public static void main(String[] args){
    Rectangle r1 = new Rectangle();
    r1.a = 2.0;
    r1.b = 3.0;
    r1.calculateArea();
    r1.calculateDim();
    r1.displayData();
    
    }

}