import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class NonImportedMedicalItemTest {


    @Test
    public void shouldCalculateSalesTax() {
        NonImportedMedicalItem medical = new NonImportedMedicalItem(50.00);

        double salesTax = medical.salesTax();

        assertThat(salesTax, is(0.00));
    }

}