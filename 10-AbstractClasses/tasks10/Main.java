public class Main {
    public static void main(String[] args){
        // Rectangle rec = new Rectangle(2, 3);
        // Triangle t = new Triangle(2,3,4,5);
        // Circle c = new Circle(4);
        // System.out.println(c.area()); 
        // System.out.println(c.perimeter()); 

        SMS s = new SMS("Hi", "123456789");
        s.send();
        System.out.println("char num: " + s.charNumber());
        Email e = new Email("Halo", "powitanie", "pies@gmail.com");
        e.send();

    }
}
