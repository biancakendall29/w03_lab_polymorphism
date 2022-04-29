package checkouts;

import books.Book;
import books.BookStatus;

public class Checkout {

    private String name; //customer name
    private String date; //date of checkout
    private BookStatus status;

    public Checkout(String name, String date, BookStatus status) {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public BookStatus getStatus() {
        return this.status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }


}
