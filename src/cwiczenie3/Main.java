package cwiczenie3;

public class Main {
    public static void main(String[] args) {
        CarInfo carInfo = new SkodaInfo();
        IMaxSpeed carSpeed = new NormalCarSpeed();
        Car car = new Car(carInfo, carSpeed);


        car.getCarInfo().getName();
        car.getMaxCarSpeed().getMaxSpeed();
    }
}
