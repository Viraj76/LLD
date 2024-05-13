package _2_Strategy_Pattern;

import _2_Strategy_Pattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
