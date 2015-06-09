import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ImportedBookTest {

    @Test
    public void shouldCalculateSalesTax() {
        ImportedBook book = new ImportedBook(50.00);

        double salesTax = book.salesTax();

        assertThat(salesTax, is(0.00));
    }

    @Test
    public void shouldCalculateImportDutyTax() {
        ImportedBook book = new ImportedBook(50.00);

        double salesTax = book.importDuty();

        assertThat(salesTax, is(2.50));
    }



}