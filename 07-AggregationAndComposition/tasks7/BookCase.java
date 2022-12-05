package tasks7;

import java.util.Arrays;

public class BookCase {
    private Book[] books;


    public BookCase() {
        this.books = new Book[0];
    }


    public Book[] getBooks() {
        return this.books;
    }

    public int getBooksNum() {
        return this.books.length;
    }

    public void addBook(Book book) {
        Book[] newarr = new Book[getBooksNum() + 1];
        for (int i = 0; i < getBooksNum(); i++)
            newarr[i] = getBooks()[i];

        newarr[getBooks().length] = book;
        this.books = newarr;
    }

    public Book[] removeFile(String title) {
        Book[] newarr = new Book[getBooksNum() - 1];
        int j = 0;
        for (int i = 0; i < getBooksNum(); i++) {
            if (getBooks()[i].getTitle().equals(title)) {
                continue;
            }
            newarr[j] = getBooks()[i];
            j++;
        }

        this.books = newarr;
        return this.books;
    }

    public String toString() {
        return
                "My bookcase: " +
                        "\nAll books: " + Arrays.toString(getBooks()) +
                        "\nBooks number: " + getBooksNum();
    }

}
