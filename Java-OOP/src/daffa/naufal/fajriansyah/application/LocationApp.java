// Membuat Abstract Class
package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.City;
import daffa.naufal.fajriansyah.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); <- Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
