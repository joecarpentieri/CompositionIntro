package vehicles;

import products.IProduct;

public class Bicycle extends Vehicle implements ILandVehicle{
    private int wheelCount;

    public Bicycle(float weight, int maxSpeed, IProduct baseproduct){
        super(weight, maxSpeed, baseproduct);
        this.wheelCount = 2;
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
