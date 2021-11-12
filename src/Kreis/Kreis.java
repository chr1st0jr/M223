package Kreis;

public class Kreis {
    public double umfang(double radius){
        return 2 * Math.PI* radius;
    }

    public double flaeche(double radius){
        return Math.PI * Math.pow(radius,2);
    }

    public double durchmesser(double radius){
        return 2 * radius;
    }
}
