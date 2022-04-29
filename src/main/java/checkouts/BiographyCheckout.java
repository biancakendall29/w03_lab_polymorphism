package checkouts;

import books.Book;
import books.BookStatus;

public class BiographyCheckout extends Checkout {

    public BiographyCheckout(String name, String date, BookStatus status) {

        super(name, date, status);

    }

}
