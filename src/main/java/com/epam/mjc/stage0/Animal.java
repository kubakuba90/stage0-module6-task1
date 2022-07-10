package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String valueOfFur;
        String valOfPaws;

        if (hasFur) {
            valueOfFur = "a";
        } else {
            valueOfFur = "no";
        }

        if (numberOfPaws > 1) {
            valOfPaws = "paws";
        } else
            valOfPaws = "paw";


        return "This animal is mostly " + color + "." + " It has " +
                numberOfPaws + " "+ valOfPaws + " and " + valueOfFur + " fur.";
    }

}
