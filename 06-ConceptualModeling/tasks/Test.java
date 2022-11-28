public class Test {

    public static void main(String[] args){
        Car c1 = new Car("Audi A3", "Audi");
        System.out.print(c1);
        c1.drive();
        System.out.print(c1);

        System.out.println();
        Book b1 = new Book("HP", 123, "fantasy");
        System.out.print(b1);

        System.out.println();
        Scoring p1 = new Scoring();
        System.out.print(p1);
        System.out.println();
        Scoring p2 = new Scoring();
        System.out.print(p2);
        System.out.println();
        Scoring p3 = new Scoring();
        System.out.print(p3);

        System.out.println();
        ShoppingList sp = new ShoppingList();
        System.out.print(sp);
        System.out.println();
        // String[] arr = {"banan", "sok", "owoce"};
        // sp.setProducts(arr);
        sp.setProducts();
        System.out.print(sp);
        System.out.println();
        System.out.println(sp.displayProductsNum());
        sp.addProducts("oliwa");
        System.out.print(sp);
        System.out.println();
        System.out.println(sp.displayProductsNum());
    }
}
