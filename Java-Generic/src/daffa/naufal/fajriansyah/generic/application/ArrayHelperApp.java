package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Daffa", "Naufal", "Fajriansyah"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
