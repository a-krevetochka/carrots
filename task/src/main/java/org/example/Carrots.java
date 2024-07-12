package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrots {
    public static void main(String[] args) {
        ArrayList<Integer> meadows = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Double maxWeight = 5.0;
        Double maxTimes = 10.0;
        Double kg = meadows.stream().mapToDouble(Integer::doubleValue).sum();
        Double counter = kg / maxWeight;
        if (counter > maxTimes) {
            kg = maxTimes * maxWeight;
            counter = maxTimes;
        }
        System.out.println("Заяц собрал " + kg + " кг моркови за " + counter + " заходов");
    }
}