package com.carefoot.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps a list of city objects
 * @version 1.0
 */
public class CityList {

    private final List<City> cityList;

    /**
     * Create a new empty city list
     */
    public CityList() {
        this.cityList = new ArrayList<>();
    }

    /**
     * Add a city to the city list if it doesn't already exist
     * @param city city object to add
     */
    public void add(City city) {
        if (cityList.contains(city)) {
            throw new IllegalArgumentException();
        }
        cityList.add(city);
    }

    /**
     * Get a sorted list of cities
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = cityList;
        Collections.sort(list);
        return list;
    }

    /**
     * Returns if the list contains the given city
     * @param city city to check
     * @return whether or not city is in list
     */
    public boolean hasCity(City city) {
        return cityList.contains(city);
    }

    /**
     * Remove the provided city from the list.
     * If the provided city is not in the list, an exception is thrown
     * @param city city to remove
     */
    public void delete(City city) {
        if (!cityList.contains(city)) {
            throw new IllegalArgumentException();
        }
        cityList.remove(city);
    }

    /**
     * Get the size of the city list
     * @return number of cities in list
     */
    public int count() {
        return cityList.size();
    }
}
