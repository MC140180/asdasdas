package cwiczenie3;

public class Main {
    public static void main(String[] args) {
        ICarInfo carInfo = new SkodaInfo();
        IMaxSpeed carSpeed = new NormalCarSpeed();
        Car car = new Car(carInfo, carSpeed);


        System.out.println(car.getCarInfo().getName());
        System.out.println(car.getMaxCarSpeed().getMaxSpeed());
    }
}
