package cwiczenie3;

public class Car {
    private ICarInfo carInfo;
    private IMaxSpeed maxCarSpeed;
    public Car(ICarInfo carInfo, IMaxSpeed maxCarSpeed) {
        this.carInfo = carInfo;
        this.maxCarSpeed = maxCarSpeed;
    }

    public ICarInfo getCarInfo() {
        return carInfo;
    }

    public IMaxSpeed getMaxCarSpeed() {
        return this.maxCarSpeed;
    }
}
