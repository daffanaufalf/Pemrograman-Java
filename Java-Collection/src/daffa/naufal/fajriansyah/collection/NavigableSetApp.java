package daffa.naufal.fajriansyah.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Daffa", "Naufal", "Fajriansyah", "Universitas", "Budi", "Luhur"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> naufal = names.tailSet("Naufal", true);

        for (var name: naufal) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups"); // Error

    }
}
