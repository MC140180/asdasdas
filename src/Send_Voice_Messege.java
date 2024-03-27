public class Send_Voice_Messege implements Show_AD {

    @Override
    public void show_Ad(Advertisement advertisement, Target target) {
        advertisement.setTranslate_Local(target.translate_Messege(advertisement.getAd_content()));

        System.out.println(advertisement.getTranslate_Local() + "Wyslano wiadomosc glosowa do" + " " + target.getData().getVoice());

    }

}
