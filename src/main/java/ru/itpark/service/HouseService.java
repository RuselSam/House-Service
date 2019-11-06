package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList();

    public void addHouse(House house) {
        houses.add(house);
    }
    public List <House> searchPrice (int minPrice, int maxPrice) {
        List<House> search = new ArrayList<>();
        for (House house : houses) {
            if (house.getPrice() >= minPrice && house.getPrice() <= maxPrice) {
                search.add(house);
            }
        }
        return search;
    }

    public List <House> searchArea (String area){
        List<House> search = new ArrayList<>();
        for (House house : houses) {
            if (house.getArea().equals(area)){
                search.add(house);
            }
        }
        return search;
    }

}