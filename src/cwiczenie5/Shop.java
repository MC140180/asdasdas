package cwiczenie5;

import java.util.ArrayList;

public class Shop {
    Shop() {

    }



    public String doCalculateTax(Client client){
       return client.taxCalculation.calculateTax();
    }
}
