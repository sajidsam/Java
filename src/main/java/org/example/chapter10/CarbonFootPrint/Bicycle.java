package org.example.chapter10.CarbonFootPrint;
public class Bicycle implements CarbonFootprint {
    @Override
    public double getCarbonFootprint() {
        return 0.0; // Bicycles have no carbon footprint in this model
    }

    public String getBicycleInfo() {
        return "Bicycle (no carbon footprint).";
    }
}

