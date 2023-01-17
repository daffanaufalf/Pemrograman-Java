package daffa.naufal.fajriansyah.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Daffa", "Naufal", "Fajriansyah");

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();

        // Manual
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
