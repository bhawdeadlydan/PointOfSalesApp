import interfaces.NonImportedGoods;
import interfaces.NonTaxableGoods;

public class NonImportedMedicalItem implements NonTaxableGoods, NonImportedGoods {

    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    public NonImportedMedicalItem(double price) {
        this.price = price;
    }

    @Override
    public double importDuty() {
        return 0;
    }

    @Override
    public double salesTax() {
        return 0;
    }
}
