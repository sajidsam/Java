package org.example.chapter10.CarbonFootPrint;
import java.util.ArrayList;
public class Main {

        public static void main(String[] args) {
            // Create objects of Building, Car, and Bicycle
            Building building = new Building(12000); // 12000 kWh per year
            Car car = new Car(8, 15000); // 8 L/100 km, 15000 km driven per year
            Bicycle bicycle = new Bicycle();

            // Create an ArrayList of CarbonFootprint
            ArrayList<CarbonFootprint> items = new ArrayList<>();
            items.add(building);
            items.add(car);
            items.add(bicycle);

            // Iterate through the ArrayList and print carbon footprints
            for (CarbonFootprint item : items) {
                if (item instanceof Building) {
                    Building b = (Building) item;
                    System.out.println(b.getBuildingInfo() + " Carbon footprint: " + b.getCarbonFootprint() + " kg CO2/year");
                } else if (item instanceof Car) {
                    Car c = (Car) item;
                    System.out.println(c.getCarInfo() + " Carbon footprint: " + c.getCarbonFootprint() + " kg CO2/year");
                } else if (item instanceof Bicycle) {
                    Bicycle b = (Bicycle) item;
                    System.out.println(b.getBicycleInfo() + " Carbon footprint: " + b.getCarbonFootprint() + " kg CO2/year");
                }
            }
        }
    }

