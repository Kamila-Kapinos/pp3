public class Audiobook extends Book {

    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, Publisher publisher, int minutes, int seconds, int publicationYear) {
        super(title, author, publisher, publicationYear);
        this.minutes = minutes;
        this.seconds = seconds;

        // TODO Auto-generated constructor stub
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display() {
        System.out.println("Book's title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nTime: " + getMinutes()
                + ":" + getSeconds() + "\nBook's publisher: " + getPublisher() + "\nYear: " + getPublicationYear());
    }

}
