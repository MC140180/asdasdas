package cwiczenie4;

public class RubberDuck extends Duck{
    RubberDuck() {
        super();
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Squeak();
    }
}
