package Products;

import enums.Manufacture;
import enums.CarType;

public class ElectricAuto extends Automobile {
    private int numberOfBattery;
    private boolean isTelsla;


    public ElectricAuto(String v, Manufacture manufacture, int range, String color, double basePrice, String vCode, double luxT, int numOfBatter, boolean isTel) {
        super(v, manufacture, range, color, basePrice, vCode, luxT);

        //type specific
        this.numberOfBattery = numOfBatter;
        this.isTelsla = isTel;
        this.limitable = true;
        this.type = CarType.ELECTRIC;
        this.setRange(range);

    }

    public int getNumberOfBattery() {
        return numberOfBattery;
    }

    public void setNumberOfBattery(int numberOfBattery) {
        this.numberOfBattery = numberOfBattery;
    }

    public boolean isTelsla() {
        return isTelsla;
    }

    public void setTelsla(boolean telsla) {
        isTelsla = telsla;
    }
}
