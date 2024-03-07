package cwiczenie3;

public class MaxCarSpeed {
    private Engine engine;
    MaxCarSpeed(Engine engine){
        this.engine = engine;
    }

   int getMaxSpeed() {
      return  this.engine.getMaxSpeed();
    }
}
