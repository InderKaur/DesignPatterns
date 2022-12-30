package WithStrategyPattern;

public class Vehicle {

    DriveStrategy driveStrategy; // Binding is done at run-time depending upon the type of strategy that is required

    // Constructor Injection
    Vehicle(DriveStrategy dStrategy){
        this.driveStrategy = dStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }

}
