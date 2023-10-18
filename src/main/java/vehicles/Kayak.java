package vehicles;

import products.IProduct;

public class Kayak extends Vehicle implements IWaterVehicle{

    private String hullType;
    
    public Kayak(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }



}
