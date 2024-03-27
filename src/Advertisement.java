public class Advertisement {

    private final String ad_content;

    private String translate_Local;

    public Advertisement(String ad_content, Show_AD show_ad) {this.ad_content = ad_content; }
    public String getTranslate_Local() {return translate_Local; }
    public void setTranslate_Local(String translate_Local) {this.translate_Local = translate_Local;}
    public Advertisement(String ad_content) {this.ad_content = ad_content; }
    public String getAd_content() {return ad_content; }

}
