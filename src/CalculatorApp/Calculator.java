package CalculatorApp;
import java.util.LinkedList;
import java.util.List;


import enums.BoatType;
import enums.Manufacture;
import Products.Boat;
import Products.DieselAuto;
import Products.ElectricAuto;
import Products.SemiTruck;
import Products.Vehicle;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Vehicle v1 = new SemiTruck("12345", Manufacture.TOYOTA, 400, "Red", 4, 6, 500, "300", 200);
        Vehicle v2 = new DieselAuto("231902", Manufacture.MAZDA, 500, "Balck", 4, 4, 1200, "777", 400);
        //Vehicle v3 = new StandardAuto("444555", Manufacture.TOYOTA, 350, "White", 400, new Date(), 3, "555", 600);
        Vehicle v4 = new ElectricAuto("335612", Manufacture.MAZDA, 320, "Silver", 3, false, 400, "33423", 200);
        Vehicle v5 = new Boat(BoatType.BARGE, 400, 200, "500", "432156", 300, false);
        Vehicle v6 = new Boat(BoatType.CARGO, 500, 350, "500", "444333", 600, true);
        Vehicle v7 = new Boat(BoatType.YACHT, 400, 200, "300", "433356", 300, true);
        calculator.addVehicle(v1);
        calculator.addVehicle(v2);
        //calculator.addVehicle(v3);
        calculator.addVehicle(v4);
        calculator.addVehicle(v5);
        calculator.addVehicle(v6);
        calculator.addVehicle(v7);
        calculator.displayOrderInformation();
    }

    private List<Vehicle> list;
    private int numOfVehicle;
    private double totalCost;

    Calculator(){
        list = new LinkedList<>();
        numOfVehicle = 0;
        totalCost = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
        numOfVehicle++;
        totalCost = totalCost + vehicle.getCost();
    }

    public void displayOrderInformation(){
        for (Vehicle v : list){
            v.displayDetail();
        }
        System.out.print("There are " + numOfVehicle + " vehicles in your order, Complete total of the order would be " + totalCost);
    }
}
