package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Daffa", "Indonesia"),
                new Person("Akmal", "Indonesia"),
                new Person("Gugul", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
