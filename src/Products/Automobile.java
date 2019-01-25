package Products;

import enums.Manufacture;
import exceptions.BadInputException;


public abstract class Automobile extends Vehicle {
    //specific values for auto
    protected boolean specialLicenseRequired = false;
    protected String color = "Black";
    protected final Manufacture manufacture;

    //common constructor for all auto
    public Automobile(String v, Manufacture manufacture, int range, String color, double basePrice, String vCode, double luxT) {

        this.vin = v;
        this.manufacture = manufacture;
        this.color = color;
        this.basePrice = basePrice;
        this.vehicleCode = vCode;
        this.luxTax = luxT;
    }

    @Override
    public void displayDetail() {
        String message =
                this.type + " by " + this.manufacture + " with VIN " + this.vin + " is available to rent in " + color + ". This beast has a range of " + this.range + " and only costs $" + this.getCost();

        if (this.limitable) {
            message += " unless range exceeded";
        }

        System.out.println(message);
    }

    @Override
    public void determineRange(int r) {
        try {
            if (this.limitable) {

                if (r < 50 || r > 499) throw new BadInputException("RANGE IS OUT OF BOUND.");

            } else {

                if (r <= 0) throw new BadInputException("INVALID RANGE!");
            }
        } catch (BadInputException ex) {
            ex.printStackTrace();
        }

        this.range = r;
    }

    public boolean isSpecialLicenseRequired() {
        return specialLicenseRequired;
    }

    public void setSpecialLicenseRequired(boolean specialLicenseRequired) {
        this.specialLicenseRequired = specialLicenseRequired;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLimitable() {
        return limitable;
    }

    public void setLimitable(boolean limitable) {
        this.limitable = limitable;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

}
