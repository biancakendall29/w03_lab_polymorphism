package checkouts;

import books.BookStatus;
import books.ScienceFiction;

public class ScienceFictionCheckout extends Checkout{

    public ScienceFictionCheckout(String name, String date, BookStatus status) {
        super(name, date, status);
    }

}
