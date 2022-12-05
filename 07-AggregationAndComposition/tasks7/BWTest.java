package tasks7;

public class BWTest {
    public static void main(String[] args){
        Writer w1 = new Writer("Ala", "Makota", 40);
        Book b1 = new Book("Elementarz", 30, w1);
        System.out.println(b1);
        BookCase bc1 = new BookCase();
        bc1.addBook(b1);
        System.out.println(bc1);
    }
}
