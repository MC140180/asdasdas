package cwiczenie4;

public class MallardDuck extends Duck{
    MallardDuck() {
        super();
        this.flyBehaviour = new JustFly();
        this.quackBehaviour = new Quack();
    }
}
