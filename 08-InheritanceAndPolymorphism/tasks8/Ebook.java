public class Ebook extends Book {

    private String fileName;

    public Ebook(String title, String author, Publisher publisher, String fileName, int publicationYear) {
        super(title, author, publisher, publicationYear);
        this.fileName = fileName;
        // TODO Auto-generated constructor stub
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println(
                "Book's title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nFile name: " + getFileName() + "\nBook's publisher: " + getPublisher() + "\nYear: " + getPublicationYear());
    }

}
