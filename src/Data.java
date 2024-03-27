public class Data {

    private final String nickname;

    private final String email;

    private final String phone;

    private final String voice;

    private final String localition;

    private String getNickname() {return nickname;}

    public String getEmail() {return email;}

    public String getPhone() {return phone;}

    public String getVoice() {return voice;}

    public String getLocalition() {return localition;}

    public Data(String nickname, String email, String phone, String voice, String localition) {
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.voice = voice;
        this.localition = localition;
    }

}
