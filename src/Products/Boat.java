package Products;
import enums.BoatType;
import exceptions.BadInputException;

public class Boat extends Vehicle{
    public Boat(BoatType type, int range, double luxT, String vCode, String vin, double bPrice, boolean limit) {

        this.type = type;

        //different type of boats have different tax amount
        this.luxTax = luxT;

        this.vehicleCode = vCode;
        this.vin = vin;
        this.basePrice = bPrice;
        this.limitable = limit;

        //special requirement for boat
        setRange(range);
        this.range *= 7;
    }

    @Override
    public void displayDetail() {
        System.out.println
                (this.type + " with VIN " + this.vin + " is available to rent. This beauty has a range of " + this.range + " and only costs $" + getCost());

    }
    @Override
    public void determineRange(int r){
        try {
            if(r > 0) this.range = r;
            else throw new BadInputException("Invalid Range.");
        }
        catch(BadInputException ex) {
            ex.printStackTrace();
        }
    }

}
