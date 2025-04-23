package org.example.chapter10.CarbonFootPrint;

public class Building implements CarbonFootprint {
    private double energyConsumption; // energy consumption in kilowatt-hours per year

    public Building(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    // Calculate carbon footprint based on energy consumption (example factor)
    @Override
    public double getCarbonFootprint() {
        return energyConsumption * 0.92; // Example: 0.92 kg CO2 per kWh
    }

    public String getBuildingInfo() {
        return "Building with " + energyConsumption + " kWh/year energy consumption.";
    }
}
