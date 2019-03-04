package com.gerardobecerril;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Vehicle[] myArray = new Vehicle[5];
        LinkedList<Vehicle> myVehicles = new LinkedList<Vehicle>();

        myArray[0] = new Jeep("Fred's Jeep", 4);
        myArray[1] = new Jeep("Frank's Jeep", 4);
        myArray[2] = new Hovercraft("Sue's Hover-craft", 8, 0.0);
        myArray[3] = new Frigate("Money Waster", 0.0);
        myArray[4] = new PoliceCar("Chief Hopper's Car", 4);

        // Con LinkedList
        myVehicles.add(new Jeep("Fred's Jeep", 4));
        myVehicles.add(new Jeep("Frank's Jeep", 4));
        myVehicles.add(new Hovercraft("Sue's Hover-craft", 8, 0.0));
        myVehicles.add(new Frigate("Money Waster", 0.0));
        myVehicles.add(new PoliceCar("Chief Hopper's Car", 4));

        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myArray[i];
                lv.drive();
            }

            if (myArray[i] instanceof IEmergency) {
                IEmergency ie = (IEmergency) myArray[i];
                ie.soundSiren();
            }

        }

        System.out.println("----------");

        // Con LinkedList
        for (int i=0; i<myVehicles.size(); i++) {

            System.out.println(myVehicles.get(i).getName());

            if (myVehicles.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myVehicles.get(i);
                lv.drive();
            }

            if (myVehicles.get(i) instanceof IEmergency) {
                IEmergency ie = (IEmergency) myVehicles.get(i);
                ie.soundSiren();
            }

        }

    }
}
