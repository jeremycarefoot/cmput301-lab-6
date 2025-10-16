package com.carefoot.listycity;

/**
 * This class defines a city, which includes a city name and province.
 * @version 1.0
 */
public class City implements Comparable<City> {

    /**
     * Class variables include
     * city - city name
     * province - city province name
     */
    private String city;
    private String province;

    /**
     * This is the default city constructor
     * @param city city name
     * @param province city province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Get the city name
     * @return city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Get the city province name
     * @return city province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Lexigraphically compares to another city object
     * @param city the city to be compared.
     * @return -1, 0, or 1 (comparison value)
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
