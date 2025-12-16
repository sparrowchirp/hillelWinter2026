package com.app.hw01;

public class Converter {

    private static final double CONV_K = 2.20462;

    static void main() {
        System.out.println("Converter App for measures.");
        System.out.println("Converter App.");
        System.out.println(" Version 1.0");

         double kgs = 5;
         double pnds = 12;

         double pounds = convKgsToPounds(kgs);
         double kilos = convPoundsToKg(pnds);
         System.out.println("Result is " + pounds + " pounds" + " and" + kilos + " kgs." );
     }

    private static double convPoundsToKg(double pnds) {
        return pnds / CONV_K;
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}

