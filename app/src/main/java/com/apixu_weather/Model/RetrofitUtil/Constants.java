package com.apixu_weather.Model.RetrofitUtil;

import java.util.ArrayList;

/**
 * Created by Omtel on 29.12.2017.
 */

public class Constants {
    private  ArrayList<String> cities = new ArrayList<>();

    public Constants() {
        cities.add("istanbul");
        cities.add("ankara");
        cities.add("izmir");
        cities.add("Samsun");
        cities.add("Adana");
        cities.add("Sivas");
        cities.add("Konya");
        cities.add("cankaya");
        cities.add("Antalya");
        cities.add("Diyarbakir");
        cities.add("Kayseri");
        cities.add("Erzurum");
        cities.add("Van");
        cities.add("Mercin");
        cities.add("Malatya");

        cities.add("Maltepe");
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }
}
