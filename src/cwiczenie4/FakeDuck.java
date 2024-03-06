package cwiczenie4;

public class FakeDuck extends Duck {
    FakeDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new MuteQuack();
    }
}
