package com.company;

public class CarpetCostCalculator {

    public static void main(String[] args) {
        int width = 100;
        int length = 250;

        Carpet carpetObject = new Carpet(10);

        Floor floorObject = new Floor(width, length);

        Calculator calculatorObject = new Calculator(floorObject, carpetObject);

        System.out.println("Total cost of carpet in the Room is " +calculatorObject.getTotalCost());

    }
}
