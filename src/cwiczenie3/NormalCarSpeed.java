package cwiczenie3;

public class NormalCarSpeed extends CarSpeed implements IMaxSpeed {
    NormalCarSpeed(){
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }
}
