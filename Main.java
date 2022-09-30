package com.company;


public class Main {

    public static void main(String[] args) {


        Container container=new Container("Container",4,1,2, 2);
        container.utilitylevelofCapacity();
        RoRo roro=new RoRo("RoRo",0,0,8, 230,"Car" );
        RoRo roro1=new RoRo("RoRo",4,3,30, 500,"Truck" );
        roro.utilitylevelofCapacity();
        roro1.utilitylevelofCapacity();



        // Tankers
        Tankers tankers=new Tankers("Tankers",4,5,6, 50);
        //System.out.println(tankers);
        tankers.utilitylevelofCapacity();
        //test
        //System.out.println(container.LoadingCargo());
    }
}
