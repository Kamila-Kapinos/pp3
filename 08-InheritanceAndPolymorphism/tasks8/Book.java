public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private int publicationYear;

    public Book(String title, String author, Publisher publisher, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public Book(String string, String string2) {
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void display() {
        System.out.println("Book's title: " + getTitle() + "Book's author: " + getAuthor() + "Book's publisher: " + getPublisher() + "Year: " + getPublicationYear());
    }

}
