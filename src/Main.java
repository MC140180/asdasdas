import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Advertisement advertisement = Data_Clients.GetRandom_Advertisement();
        ArrayList<Target> targets = Data_Clients.getRandomTargets();

        Client client_1 = new Client("FirmaX", new Send_Voice_Messege());
        Client client_2 = new Client("FirmaY", new Send_SMS());
        Client client_3 = new Client("FirmaZ", new Send_Email());

        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(client_1);
        clients.add(client_2);
        clients.add(client_3);

        clients.forEach(client -> {
            targets.forEach(Target -> {
                client.doShow_ad(advertisement, Target);
            });
        });




    }
}