package Products;
import enums.Manufacture;
import enums.CarType;

public class SemiTruck extends DieselAuto{
    public SemiTruck(String v,
                     Manufacture manufacture,
                     int range,
                     String color,
                     int numberOfWheels,
                     int numberOfCylinders,
                     double basePrice,
                     String vCode,
                     double luxT) {
        super(v, manufacture, range, color, numberOfWheels, numberOfCylinders, basePrice, vCode, luxT);
        //type specific
        this.specialLicenseRequired = true;
        this.limitable = true;
        this.type = CarType.SEMI_TRUCK;

        //set and determine range finally
        this.setRange(range);
    }
}
