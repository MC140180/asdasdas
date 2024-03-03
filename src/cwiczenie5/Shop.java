package cwiczenie5;

public class Shop {

    private TaxCalculation taxCalculation;
    Shop(LocationEnum location) {
        this.setUpShopByLocation(location);
    }

    private void setUpShopByLocation(LocationEnum location) {
        if (location == LocationEnum.PL) {
            this.setTaxCalculation(new TaxPL());
            return;
        }
        if (location == LocationEnum.DE) {
            this.setTaxCalculation(new TaxDE());
            return;
        }
        if (location == LocationEnum.GB) {
            this.setTaxCalculation(new TaxGB());
            return;
        }
        System.out.println("Shop hasn't got set up.");
    }
    public TaxCalculation getTaxCalculation() {
        return this.taxCalculation;
    }

    public void setTaxCalculation(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public String doCalculateTax(){
       return this.taxCalculation.calculateTax();
    }
}
