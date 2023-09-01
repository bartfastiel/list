package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String atHome = "Miele";
        String spontaneous = "Xiaomi";
        String inGarden = "Bosch";
        String inCar = "Aldi";

        List<String> vacuums = new ArrayList<>();
        vacuums.add(atHome);
        vacuums.add(spontaneous);
        vacuums.add(inGarden);
        vacuums.add(inCar);

        System.out.println(vacuums);

        String favoriteVacuum = vacuums.get(0);
        System.out.println(favoriteVacuum);

        for (String vacuum : vacuums) {
            System.out.println("Ich staubsauge mit " + vacuum);
        }


    }
}