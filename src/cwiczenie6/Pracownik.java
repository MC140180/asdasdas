package cwiczenie6;

public class Pracownik {
    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private String zawod;
    Pracownik(String zawod) {
        this.zawod = zawod;
    }
    public Pracowac getPracowac() {
        return pracowac;
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public SpedzanieWolnegoCzasu getSpedzanieWolnegoCzasu() {
        return spedzanieWolnegoCzasu;
    }

    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public Dojezdzac getDojezdzac() {
        return dojezdzac;
    }

    public void setDojezdzac(Dojezdzac dojezdzac) {
        this.dojezdzac = dojezdzac;
    }

    public void wykonujPrace() {
        this.pracowac.pracuj();
    }
    public void jedzDoPracy() {
        this.dojezdzac.dojezdzaj();
    }
    public void odpoczywaj() {
        this.spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }
}
