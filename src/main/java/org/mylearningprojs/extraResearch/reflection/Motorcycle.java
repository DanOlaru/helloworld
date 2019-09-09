package org.mylearningprojs.extraResearch.reflection;

public class Motorcycle extends Vehicular {
    private String manufacturer;
    private String model;
    private int modelYear;

    public Motorcycle() {
        this.manufacturer = "";
        this.model = "";
        this.modelYear = -999;
    }

    public Motorcycle(String manufacturer, String model, int modelYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.modelYear = modelYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void vroom() {
        System.out.println("make 'vroom!' sound");
    }

}
