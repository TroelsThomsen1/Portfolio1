package com.company;

public class Tankers extends Allvessels {
    public Tankers(String flagnation, int draft, double width, double length, double Cargo) {
        super(flagnation, draft, width, length, Cargo);
    }


    @Override
    public void utilitylevelofCapacity() {
        double maxCargo = 500;
        if(Cargo <= 0)
        {
            System.out.println("Cargo = " + Cargo);
        }
        else {
            for(int i=0; i<10; i++) {
                double calculation = (Cargo / maxCargo) * 100;
                System.out.println("Tankers components filled " + calculation + "%");
            }
        }
    }


}
