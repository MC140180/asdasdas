package cwiczenie3;

public abstract class Engine implements IEngine{
    Engine(){

    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }
}
