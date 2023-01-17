package daffa.naufal.fajriansyah.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Daffa");
        collection.add("Naufal");
        collection.add("Fajriansyah");
        collection.addAll(List.of("Universitas","Budi", "Luhur"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println("Remove");

        collection.remove("Daffa");
        collection.removeAll(List.of("Budi", "Luhur"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Naufal")
        );

        System.out.println(
                collection.containsAll(List.of("Fajriansyah", "Universitas"))
        );

        System.out.println(collection.size());

    }
}
