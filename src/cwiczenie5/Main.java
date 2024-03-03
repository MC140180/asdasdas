package cwiczenie5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shopPL = new Shop(LocationEnum.PL);
        Shop shopGB = new Shop(LocationEnum.GB);
        Shop shopDE = new Shop(LocationEnum.DE);

        System.out.println(shopPL.doCalculateTax());;
        System.out.println(shopDE.doCalculateTax());;
        System.out.println(shopGB.doCalculateTax());;
    }
}
