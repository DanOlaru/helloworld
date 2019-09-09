package org.mylearningprojs.extraResearch.reflection;

public class Vehicular {
    private String typeOfVehicle;
    private int numberOfAxles;

    public Vehicular() {
    }

    public Vehicular(String typeOfVehicle, int numberOfAxles) {
        this.typeOfVehicle = typeOfVehicle;
        this.numberOfAxles = numberOfAxles;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
