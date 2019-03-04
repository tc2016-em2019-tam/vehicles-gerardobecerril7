package com.gerardobecerril;

public class PoliceCar extends Vehicle implements LandVehicle, IEmergency {

    private int numWheels;

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    public void listenToPoliceRadio() {
        System.out.println("You're listening to police radio.");
    }

    @Override
    public void soundSiren() {
        System.out.println("Wiu wiu");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("You're driving the police car.");
    }
}
