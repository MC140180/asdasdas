package cwiczenie3;

public class CarInfo  implements ICarInfo{
    protected String name;

    CarInfo(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}
