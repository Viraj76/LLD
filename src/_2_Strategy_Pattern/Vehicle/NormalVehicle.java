package _2_Strategy_Pattern;

import _2_Strategy_Pattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
