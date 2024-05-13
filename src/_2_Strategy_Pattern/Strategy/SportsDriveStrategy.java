package _2_Strategy_Pattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("SportsDriveStrategy");
    }
}
