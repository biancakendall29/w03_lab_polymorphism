package books;

import checkouts.Checkout;
import libraries.Library;

public class Biography extends Book {

    public Biography(String title, String author, int bookingId, Library library) {
        super(title, author, bookingId, library);
    }

    @Override
    public Checkout takeOut() {
        Checkout checkout = this.home.getBioCheckOut().pop();
        System.out.println(checkout.getStatus());
        checkout.setStatus(BookStatus.OUT);
        return checkout;
    }

    @Override
    public Checkout takeOut(Checkout checkout) {
        System.out.println(checkout.getStatus());
        checkout.setStatus(BookStatus.OUT);
        return checkout;
    }

}
