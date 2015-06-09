import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ImportedOtherGoodTest {

    @Test
    public void shouldCalculateSalesTax() {
        ImportedOtherGood medical = new ImportedOtherGood(50.00);

        double salesTax = medical.salesTax();

        assertThat(salesTax, is(0.00));
    }

}