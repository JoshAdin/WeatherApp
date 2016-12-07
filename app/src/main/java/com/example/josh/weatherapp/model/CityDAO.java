package com.example.josh.weatherapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josh on 2016-11-19.
 */

public class CityDAO {

    private static final List<City> cities = new ArrayList<>();

    static {
        cities.add(new City("Select", "0.0", "0.0"));
        cities.add(new City("Ottawa", "45.421", "-75.69"));
        cities.add(new City("Quebec", "53.786", "-73.397"));
        cities.add(new City("Toronto", "43.653", "-79.385"));
        cities.add(new City("Waterloo", "42.498", "-92.337"));
        cities.add(new City("Windsor", "42.303", "-83.029"));
        cities.add(new City("Winnipeg", "49.883", "-97.167"));
        cities.add(new City("New York", "42.34", "-75.18"));
        cities.add(new City("Rome", "41.90", "12.50"));
            }

    public static List<City> getCities() {
        return cities;
    }
}



