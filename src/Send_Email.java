public class Send_Email implements Show_AD {

    @Override
    public void show_Ad(Advertisement advertisement, Target target) {
        advertisement.setTranslate_Local(target.translate_Messege(advertisement.getAd_content()));

        System.out.println(advertisement.getTranslate_Local() + "Wyslano e-mail" + " " + target.getData().getEmail());

    }
}
