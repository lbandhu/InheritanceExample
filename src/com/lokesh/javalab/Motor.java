package com.lokesh.javalab;

public class Motor {

    private String fuelConsumption;

    public void fuelConsumption(String engineType){
        if (engineType == "V6" || engineType == "V8") {
            fuelConsumption = "More";
            System.out.println(fuelConsumption);
        }else {
            fuelConsumption = "Less";
            System.out.println(fuelConsumption);
        }
    }

}
