import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class NonImportedOtherGoodTest {

    @Test
    public void shouldCalculateSalesTax() {
        NonImportedOtherGood otherGood = new NonImportedOtherGood(50.00);

        double salesTax = otherGood.salesTax();

        assertThat(salesTax, is(5.00));
    }

    @Test
    public void shouldCalculateImportDuty() {
        NonImportedOtherGood otherGood = new NonImportedOtherGood(50.00);

        double importDuty = otherGood.importDuty();

        assertThat(importDuty, is(0.00));
    }


}