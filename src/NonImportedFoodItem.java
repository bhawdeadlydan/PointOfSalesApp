
public class NonImportedFoodItem implements NonImportedGoods, NonTaxableGoods{

    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    @Override
    public double importDuty() {
        importDutyTax = (price + salesTax()) * importDutyRate;
        return importDutyTax;
    }

    @Override
    public double salesTax() {
        return 0;
    }
}
