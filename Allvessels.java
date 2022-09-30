package com.company;

public class Allvessels {
    private String flagnation;
    private int draft;
    private double width;
    private double length;
    public double Cargo;
    public Allvessels(String FG, int dft, double wth, double lth, double Cargo) {
        this.flagnation = FG;
        this.draft= dft;
        this.width= wth;
        this.length = lth;
        this.Cargo = Cargo;
    }


    public void LoadingCargo(double Cargoamount) {
Cargo+=Cargoamount;

    }

    public void utilitylevelofCapacity() {
double maxCargo = 1;
if(Cargo <= 0)
{
    System.out.println("Cargo = " + Cargo);
}
else {
    double calculation=(Cargo/maxCargo)*100;
    System.out.println("Plads der bliver brugt " + calculation + "%");
}
    }

}
