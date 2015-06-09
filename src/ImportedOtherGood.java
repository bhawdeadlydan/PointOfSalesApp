
public class ImportedOtherGood implements TaxableGoods, ImportedGoods{
    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    public ImportedOtherGood(double price) {
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
