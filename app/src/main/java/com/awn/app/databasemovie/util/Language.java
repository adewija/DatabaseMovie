package com.awn.app.databasemovie.util;

/**
 * Created by adewijanugraha on 05/03/18.
 */

import java.util.Locale;


public class Language {

    public static String getCountry() {
        String country = Locale.getDefault().getCountry().toLowerCase();

        switch (country) {
            case "id":
                break;

            default:
                country = "en";
                break;
        }

        return country;
    }
}
