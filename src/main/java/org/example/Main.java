package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String bird = "tweety";
        String dog = "wuffi";
        String cat = "mutzi";
        String ant = "helpi";

        List<String> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(dog);
        animals.add(cat);
        animals.add(ant);

        String favoriteAnimal = animals.get(0);
        System.out.println(favoriteAnimal);

        int numberOfAnimals = animals.size();
        System.out.println("I have " + numberOfAnimals + " animals");

        for (String anAnimal : animals) {
            System.out.println("I feed " + anAnimal);
        }
    }
}