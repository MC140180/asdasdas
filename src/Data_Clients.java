
import java.util.ArrayList;

public class Data_Clients {

    static Advertisement GetRandom_Advertisement() {
        return new Advertisement("Losowa reklama");
    }

    static ArrayList<Target> getRandomTargets() {

        ArrayList<Target> targets = new ArrayList<>();
        Target target_1 = new Target(new Data("Stefan", "Stefan@gmail.eng", "999999998", "423432-dafer-zz-24-4356", "DE"));
        Target target_2 = new Target(new Data("Andrzej", "Andrzej@gmail.de", "999889999", "42343243-dasgr-bb-23-5476", "ENG"));
        Target target_3 = new Target(new Data("Maciej", "Maciej@gmail.pl", "998888988", "48590454-fdsdf-gg-22-4837", "PL"));

        targets.add(target_1);
        targets.add(target_2);
        targets.add(target_3);

        for (Target target : targets) {
            String localition = target.getData().getLocalition();
            if (!(localition == ""))
                target.setTranslate_ad(Location_Translate.GetUserLocation(localition));
        }

        return targets;
    }
}