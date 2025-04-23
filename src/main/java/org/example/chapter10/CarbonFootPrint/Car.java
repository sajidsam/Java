package org.example.chapter10.CarbonFootPrint;
public class Car implements CarbonFootprint {
    private double fuelConsumption; // fuel consumption in liters per 100 km
    private double distanceDriven; // distance driven in kilometers per year

    public Car(double fuelConsumption, double distanceDriven) {
        this.fuelConsumption = fuelConsumption;
        this.distanceDriven = distanceDriven;
    }

    // Calculate carbon footprint based on fuel consumption and distance driven
    @Override
    public double getCarbonFootprint() {
        return (fuelConsumption / 100) * distanceDriven * 2.31; // 2.31 kg CO2 per liter of gasoline
    }

    public String getCarInfo() {
        return "Car with " + fuelConsumption + " L/100 km fuel consumption and " + distanceDriven + " km driven/year.";
    }
}

