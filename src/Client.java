public class Client {

    private String nickname;

    private Show_AD show_ad;

    public Client(String nickname, Show_AD show_ad) {
        this.nickname = nickname;
        this.show_ad = show_ad;
    }

    public Show_AD getShow_ad() { return show_ad; }

    public void setShow_ad() {this.show_ad = show_ad;}

    public String getNickname() { return nickname; }

    public void setNickname(String nickname) { this.nickname = nickname; }

    public void doShow_ad(Advertisement advertisement, Target target) {
        this.show_ad.show_Ad(advertisement, target);
    }

}
