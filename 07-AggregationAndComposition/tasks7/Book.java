package tasks7;

public class Book {

    private String title;
    private int pagesNum;
    private boolean isOpen;
    private int currentPage = 0;
    private Writer author;



    public Book(String title, int pagesNum, boolean isOpen, Writer author) {
        this.title = title;
        this.pagesNum = pagesNum;
        this.isOpen = isOpen;
        this.author = author;
    }

    public Book(String title, int pagesNum, Writer author) {
        this.title = title;
        this.pagesNum = pagesNum;
        this.author = author;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNum() {
        return this.pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    public boolean IsOpen() {
        return this.isOpen;
    }

    public Writer getAutor() {
        return this.author;
    }

    public void setAutor(Writer autor) {
        this.author = autor;
    }

    public void changePage(){
        this.currentPage ++;
    }

    public int showCurrentPage(){
        return this.currentPage;
    }

    public String toString() {
        return
            "title: " + getTitle() +
            "\npagesNum: " + getPagesNum() +
            // "\nisOpen: " + IsOpen() +
            // "\ncurrentPage: " + showCurrentPage() +
            "\nautor: " + getAutor();
    }
    
}
