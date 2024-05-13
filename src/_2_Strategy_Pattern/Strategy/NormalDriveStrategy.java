package _2_Strategy_Pattern.Strategy;

public class NormalDriveStrategy  implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}
