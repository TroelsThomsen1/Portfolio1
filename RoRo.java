package com.company;

import org.junit.jupiter.api.Test;

public class RoRo extends Allvessels {
//Has a total amount of meters and can carry cars and truck
// car is 8 meter long and truck is 30 meters.

    public String type;


    public RoRo(String flagnation, int draft, double width, double length, double Cargo, String type) {
        super(flagnation, draft, width, length, Cargo);
        this.type = type;


    }

    @Override

    public void utilitylevelofCapacity() {
        double maxCargo = 1000;
        if (Cargo <= 0) {
            System.out.println("Cargo = " + Cargo);
        } else {
            double calculation = (Cargo / maxCargo) * 100;
            System.out.println("længde af plads der bliver brugt " + calculation + "%");
        }
    }
}



