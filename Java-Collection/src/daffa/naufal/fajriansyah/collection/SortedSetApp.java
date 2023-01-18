package daffa.naufal.fajriansyah.collection;

import daffa.naufal.fajriansyah.collection.data.Person;
import daffa.naufal.fajriansyah.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Daffa"));
        people.add(new Person("Akmal"));
        people.add(new Person("Gugul"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people); // Mutable SortedSet to Immutable SortedSet
        // sortedSet.add(new Person("Naufal")); // Error

    }
}
