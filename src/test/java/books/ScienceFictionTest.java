package books;

import checkouts.Checkout;
import checkouts.ScienceFictionCheckout;
import libraries.Library;

import static books.BookStatus.OUT;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScienceFictionTest {

    ScienceFiction scienceFiction;
    ScienceFictionCheckout sfCheckOut;

    @BeforeEach
    public void setUp() {
        Library library = new Library();
        scienceFiction = new ScienceFiction("Dune", "Frank Herbert", 91011, library, true);
        sfCheckOut = new ScienceFictionCheckout("John Doe", "25 April 2022", BookStatus.RETURNED);
        library.addSciFiCheckOut(sfCheckOut);
    }

    @Test
    public void canAddToLog() {
        scienceFiction.takeOut();
        assertThat(scienceFiction.home.getSciFiCheckOut().size()).isEqualTo(1);
    }

    @Test
    public void canGetFuturistic() {
        assertThat(scienceFiction.isFuturistic()).isEqualTo(true);
    }

    @Test
    public void canCheckout() {
        Checkout checkout = scienceFiction.takeOut();
        assertThat(checkout.getStatus()).isEqualTo(BookStatus.OUT);
        System.out.println(checkout.getStatus());
    }

    @Test
    public void canCheckout2() {
        assertThat(scienceFiction.takeOut(sfCheckOut).getStatus()).isEqualTo(BookStatus.OUT);
        System.out.println(sfCheckOut.getStatus());
    }



}
