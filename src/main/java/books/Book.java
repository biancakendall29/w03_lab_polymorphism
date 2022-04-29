package books;

import checkouts.Checkout;
import interfaces.IFiction;
import libraries.Library;

import java.util.ArrayList;
import java.util.List;

public abstract class Book {

    private String title;
    private String author;
    private int bookingId;
    protected Library home;

    public Book(String title, String author, int bookingId, Library home) {

        this.title = title;
        this.author = author;
        this.bookingId = bookingId;
        //this.isTakenOut = BookStatus.RETURNED;
        this.setLibrary(home);
    }

    public void setLibrary(Library library) {
        this.home = library;
    }

    public abstract Checkout takeOut();
    public abstract Checkout takeOut(Checkout checkout);


}
