package cwiczenie3;

public class Car {
    private CarInfo carInfo;
    private CarSpeed maxCarSpeed;
    public Car(CarInfo carInfo, CarSpeed maxCarSpeed) {
        this.carInfo = carInfo;
        this.maxCarSpeed = maxCarSpeed;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public CarSpeed getMaxCarSpeed() {
        return this.maxCarSpeed;
    }
}
