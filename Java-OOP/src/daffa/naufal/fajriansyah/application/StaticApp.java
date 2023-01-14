package daffa.naufal.fajriansyah.application;

import static daffa.naufal.fajriansyah.data.Application.PROCESSORS;
import static daffa.naufal.fajriansyah.data.Constant.*;
import daffa.naufal.fajriansyah.data.Country;
import daffa.naufal.fajriansyah.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
