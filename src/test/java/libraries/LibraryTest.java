package libraries;

import books.Biography;
import books.BookStatus;
import books.ScienceFiction;
import checkouts.Checkout;
import checkouts.ScienceFictionCheckout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LibraryTest {

        Library library;
        ScienceFiction dune;

        @BeforeEach
        public void setUp() {
            library = new Library();
            library.addBook(new ScienceFiction("The Night Circus", "Erin Morgenstern", 1234, library, false));
            library.addBook(new Biography("Steve Jobs", "Walter Isaacson", 5678, library));
            library.addSciFiCheckOut(new ScienceFictionCheckout("John Doe", "26 April 2022", BookStatus.RETURNED));
            dune = new ScienceFiction("Dune", "Frank Herbert", 1222, library, true);

        }

        @Test
        public void addsBooks() {
            assertThat(library.getBooks().size()).isEqualTo(2);
        }

        @Test
        public void getSciFiCheckOut() {
            assertThat(library.getSciFiCheckOut().size()).isEqualTo(1);
        }

        @Test
        public void getCheckOutStatus() {
            Checkout checkout = dune.takeOut();
            assertThat(checkout.getStatus()).isEqualTo(BookStatus.OUT);
        }


}
