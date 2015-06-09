
public class NonImportedOtherGood implements TaxableGoods, NonImportedGoods{
    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    public NonImportedOtherGood(double price) {
        this.price = price;
    }

    @Override
    public double importDuty() {
        importDutyTax = (price + salesTax()) * importDutyRate;
        return importDutyTax;
    }

    @Override
    public double salesTax() {
        salesTax += (price * basicSalesTaxRate);
        return salesTax;
    }

}
