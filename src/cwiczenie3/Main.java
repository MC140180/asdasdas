package cwiczenie3;

public class Main {
    public static void main(String[] args) {
        CarInfo carInfo = new CarInfo("Audi");
        MaxCarSpeed maxCarSpeed = new MaxCarSpeed(new NormalEngine());
        Car car = new Car(carInfo, maxCarSpeed);


        car.getCarInfo().getName();
        car.getMaxCarSpeed().getMaxSpeed();
    }
}
