package cwiczenie3;

public class CarInfo  implements ICarInfo{
    protected String name;
   protected CarInfo(){
    }

    CarInfo(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}
