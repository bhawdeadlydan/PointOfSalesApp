import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ImportedOtherGoodTest {

    @Test
    public void shouldCalculateSalesTax() {
        ImportedOtherGood otherGoods = new ImportedOtherGood(50.00);

        double salesTax = otherGoods.salesTax();

        assertThat(salesTax, is(5.00));
    }

    @Test
    public void shouldCalculateImportDutyTax() {
        ImportedOtherGood otherGoods = new ImportedOtherGood(50.00);

        double importDuty = otherGoods.importDuty();

        assertThat(importDuty, is(2.75));
    }

}