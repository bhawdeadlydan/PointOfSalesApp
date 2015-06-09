
public interface ImportedGoods {
    double importDutyRate = 0.05;
    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    public double importDuty();
}
