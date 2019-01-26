package Products;

import enums.Manufacture;
import enums.CarType;

public class DieselAuto extends Automobile {
    private int numberOfWheels;
    private int numberOfCylinders;

    public DieselAuto(String v, Manufacture manufacture, int range, String color, double basePrice, String vCode, double luxT, int numberOfWheels, int numberOfCylinders) {
        super(v, manufacture, range, color, basePrice, vCode, luxT);

        //type specific
        this.numberOfWheels = numberOfWheels;
        this.numberOfCylinders = numberOfCylinders;
        this.type = CarType.DIESEL;
        this.setRange(range);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
