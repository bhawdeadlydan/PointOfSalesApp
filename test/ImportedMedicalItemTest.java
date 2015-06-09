import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ImportedMedicalItemTest {

    @Test
    public void shouldCalculateSalesTax() {
        ImportedMedicalItem medical = new ImportedMedicalItem(50.00);

        double salesTax = medical.salesTax();

        assertThat(salesTax, is(0.00));
    }

}