package Products;
import enums.Manufacture;
import enums.CarType;

public class SemiTruck extends DieselAuto{
    public SemiTruck(String v, Manufacture manufacture, int range, String color, double basePrice, String vCode, double luxT, int numberOfWheels, int numberOfCylinders) {
        super(v, manufacture, range, color, basePrice, vCode, luxT, numberOfWheels, numberOfCylinders);
        //type specific
        this.specialLicenseRequired = true;
        this.limitable = true;
        this.type = CarType.SEMI_TRUCK;

        //set and determine range finally
        this.setRange(range);
    }
}
