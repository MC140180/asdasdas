public class Target {

    private Translate_AD translate_ad;

    private Data data;

    public Target(Data data) {
        this.data = data;
    }

    public Data getData() { return data;}
    public void setData(Data data) { this.data = data; }

    public Translate_AD getTranslate_ad() { return translate_ad; }

    public void setTranslate_ad(Translate_AD translate_ad) {
        this.translate_ad = translate_ad;
    }

    public String translate_Messege(String ad_content) {return this.translate_ad.translate(ad_content); }




}
