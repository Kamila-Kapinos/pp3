public class Main {
    
    public static void main(String[] args){
        Library l = new Library();
        Publisher publisher = new Publisher("Marek Nowak", "Krakow");
        l.addBook("Harry Potter", "JK Rowling", publisher, 2012);
        l.addBook("Lalka", "Boleslaw Prus", publisher, 2012, "lalka.mp3");
        l.addBook("Zbrodnia i kara", "Dostojewski", publisher, 100, 40, 2012);
        l.display();
    }

}

