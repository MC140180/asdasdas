package cwiczenie5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        System.out.println(shop.doCalculateTax(new Client(LocationEnum.PL)));;
        System.out.println(shop.doCalculateTax(new Client(LocationEnum.DE)));;
        System.out.println(shop.doCalculateTax(new Client(LocationEnum.GB)));;

    }
}
