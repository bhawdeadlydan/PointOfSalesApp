import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ImportedFoodItemTest {

    @Test
    public void shouldCalculateSalesTax() {
        ImportedFoodItem chocolate = new ImportedFoodItem(50.00);

        double salesTax = chocolate.salesTax();

        assertThat(salesTax, is(0.00));
    }

    @Test
    public void shouldCalculateImportDutyTax() {
        ImportedFoodItem chocolate = new ImportedFoodItem(50.00);

        double importDuty = chocolate.importDuty();

        assertThat(importDuty, is(2.5));
    }
}