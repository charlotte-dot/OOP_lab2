package com.company.animals;

public class FarmAnimal extends Animal  {
    public FarmAnimal(String species) {
        super(species);
    }

    public Double eat(Double weight){
        if (weight > 0) {
            Double oldWeight = weight;
            weight = 0.0;
            return oldWeight;
        } else {
            System.out.println("cannot eat the animal");
            return weight;
        }
    }
}
