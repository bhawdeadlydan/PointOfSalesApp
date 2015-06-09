import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NonImportedFoodItemTest {
    @Test
    public void shouldCalculateSalesTax() {
        ImportedFoodItem chocolate = new ImportedFoodItem(50.00);

        double salesTax = chocolate.salesTax();

        assertThat(salesTax, is(5.00));
    }


}