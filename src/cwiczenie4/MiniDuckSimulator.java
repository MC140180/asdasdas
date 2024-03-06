package cwiczenie4;

import java.util.ArrayList;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mullardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck fakeDuck = new FakeDuck();

        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(mullardDuck);
        ducks.add(rubberDuck);
        ducks.add(fakeDuck);

        for(Duck duck:ducks) {
            duck.doQuack();
            duck.doFly();
        }
        ducks.get(1).setFlyBehaviour(new FlyBehaviour() {
            @Override
            public void fly() {
                System.out.println("i am flying with jet engine.");
            }
        });
        ducks.get(1).doFly();
    }
}
