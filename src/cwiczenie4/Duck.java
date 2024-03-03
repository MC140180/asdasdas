package cwiczenie4;


public abstract class Duck  {
   protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;


    protected Duck() {
    }

    public void doQuack() {
        this.quackBehaviour.quack();
    }

    public void doFly() {
        this.flyBehaviour.fly();
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
