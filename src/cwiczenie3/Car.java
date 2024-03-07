package cwiczenie3;

public class Car {
    private CarInfo carInfo;
    private MaxCarSpeed maxCarSpeed;
    public Car(CarInfo carInfo, MaxCarSpeed maxCarSpeed) {
        this.carInfo = carInfo;
        this.maxCarSpeed = maxCarSpeed;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public MaxCarSpeed getMaxCarSpeed() {
        return maxCarSpeed;
    }
}
