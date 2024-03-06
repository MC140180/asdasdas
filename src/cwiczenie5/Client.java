package cwiczenie5;

public class Client {
  LocationEnum   location;
  TaxCalculation taxCalculation;
    Client(LocationEnum location){
        this.setUpClient(location);
    }
    void setUpClient(LocationEnum location) {
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
        }
    }

    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public TaxCalculation getTaxCalculation() {
        return taxCalculation;
    }

    public void setTaxCalculation(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }
}
