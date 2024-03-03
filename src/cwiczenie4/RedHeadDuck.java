package cwiczenie4;

public class RedHeadDuck extends Duck {
    RedHeadDuck() {
        super();
        this.flyBehaviour = new JustFly();
        this.quackBehaviour = new Quack();
    }
}
