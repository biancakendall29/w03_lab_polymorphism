package books;

import checkouts.Checkout;
import interfaces.IFiction;
import libraries.Library;

public class ScienceFiction extends Book implements IFiction {

    private boolean futuristic;

    public ScienceFiction(String title, String author, int bookingId, Library library, boolean futuristic) {
        super(title, author, bookingId, library);
        this.futuristic = futuristic;
    }

    @Override
    public boolean isFuturistic() {
        return this.futuristic;
    }

    @Override
    public Checkout takeOut() {
        Checkout checkout = this.home.getSciFiCheckOut().getLast();
        System.out.println(checkout.getStatus());
        checkout.setStatus(BookStatus.OUT);
        System.out.println(checkout.getStatus());
        return checkout;
    }

    @Override
    public Checkout takeOut(Checkout checkout) {
        System.out.println(checkout.getStatus());
        checkout.setStatus(BookStatus.OUT);
        System.out.println(checkout.getStatus());
        return checkout;
    }

}
