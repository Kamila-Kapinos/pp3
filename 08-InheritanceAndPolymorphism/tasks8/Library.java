import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCase;

    public Library(){
        this.bookCase = new ArrayList<>();
    }

//addBook 3 razy

    public void addBook(String title, String author, Publisher publisher, int publicationYear){
        Book book = new Book(title, author, publisher, publicationYear);
        this.bookCase.add(book);
    }

    public void addBook(String title, String author, Publisher publisher, int publicationYear, int minutes, int seconds){
        Audiobook abook = new Audiobook(title, author, publisher, publicationYear, minutes, seconds);
        bookCase.add(abook);
    }
    
    public void addBook(String title, String author, Publisher publisher, int publicationYear, String fileName){
        Ebook ebook = new Ebook(title, author, publisher, fileName, publicationYear);
        bookCase.add(ebook);
    }

    public void display(){
        for(Book el: bookCase){
            el.display();
        }
    }


    




    

}
