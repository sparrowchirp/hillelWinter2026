package com.app.hw02;

public class ConverterKmMiles {

    private static final double CONV = 0.621371192;

    static void main() {
        System.out.println("Converter version 2.0");

        double miles = 10;
        double km = 5;

        System.out.println(miles + " miles is " + convMilesToKgs(miles) + " kilometers.");
        System.out.println( km + " kilometers is " + convKmToMiles(km) + " miles.");
    }

    private static double convMilesToKgs(double miles) {
        return miles / CONV;
    }

    private static double convKmToMiles(double km) {
        return km * CONV;
    }
}
