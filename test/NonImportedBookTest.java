import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class NonImportedBookTest {


    @Test
    public void shouldCalculateSalesTax() {
        NonImportedBook book = new NonImportedBook(50.00);

        double salesTax = book.salesTax();

        assertThat(salesTax, is(0.00));
    }

}