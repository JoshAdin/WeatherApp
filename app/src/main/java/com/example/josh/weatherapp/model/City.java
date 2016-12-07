package com.example.josh.weatherapp.model;

/**
 * Created by Josh on 2016-11-19.
 */

public class City  {

    private String name;
    private String longitude;
    private String lattitude;

    public City(String name, String lattitude, String longitude){
        this.name = name;
        this.lattitude = lattitude;
        this.longitude = longitude;

    }

    public String getName() {
        return name;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLattitude() {
        return lattitude;
    }

    @Override
    public String toString() {
        return name;
    }

}
