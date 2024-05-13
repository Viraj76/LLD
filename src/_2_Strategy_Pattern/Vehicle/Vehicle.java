package _2_Strategy_Pattern;

import _2_Strategy_Pattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategy = driveStrategyObj;
    }
    public void  drive(){
        driveStrategy.drive();
    }
}
