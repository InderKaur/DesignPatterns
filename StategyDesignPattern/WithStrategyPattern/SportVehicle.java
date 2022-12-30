package WithStrategyPattern;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDriveStrategy());
    }
}
