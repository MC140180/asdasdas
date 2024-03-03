package cwiczenie6;

public class Main {
    public static void main(String[] args) {
        Pracownik prac = new Pracownik("mechanik");

        prac.setDojezdzac(new Rower());
        prac.setSpedzanieWolnegoCzasu(new Silownia());
        prac.setPracowac(new NaprawaSamochodow());


        prac.jedzDoPracy();
        prac.wykonujPrace();
        prac.odpoczywaj();
    }
}
