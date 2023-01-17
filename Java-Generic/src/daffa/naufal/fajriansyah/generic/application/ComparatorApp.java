package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Daffa", "Indonesia"),
                new Person("Akmal", "Indonesia"),
                new Person("Gugul", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));

    }
}
