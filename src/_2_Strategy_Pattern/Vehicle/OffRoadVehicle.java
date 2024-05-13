package _2_Strategy_Pattern;

import _2_Strategy_Pattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
