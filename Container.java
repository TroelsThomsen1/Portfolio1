package com.company;


public class Container extends Allvessels{
public Container(String flagnation, int draft, double width, double length, double Cargo) { super(flagnation, draft, width, length, Cargo);}





    @Override
    public void utilitylevelofCapacity() {
        double maxCargo = 10;
        if(Cargo <= 0)
        {
            System.out.println("Cargo = " + Cargo);
        }
        else {
            double calculation=(Cargo/maxCargo)*100;
            System.out.println("Mængde af plads til container brugt " + calculation + "%");
        }
    }


}

