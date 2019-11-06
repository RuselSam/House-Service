package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.addHouse(new House(1, 10_000, "Московский", 1));
        houseService.addHouse(new House(2, 15_000, "Вахитовский", 1));
        houseService.addHouse(new House(3, 45_000, "Советский", 3));
        houseService.addHouse(new House(4, 28_000, "Приволжский", 2));
        houseService.addHouse(new House(5, 33_000, "Авиастроительный", 3));
        houseService.addHouse(new House(6, 18_000, "Вахитовский", 1));

        System.out.println(houseService.searchPrice(27_000, 35_000));

        System.out.println(houseService.searchArea("Вахитовский"));
    }
}
