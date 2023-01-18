package daffa.naufal.fajriansyah.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Daffa");

        Set<String> mutable = new HashSet<>();
        mutable.add("Daffa");
        mutable.add("Naufal");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Daffa", "Naufal");

        // set.add("Daffa"); // Error
        // set.remove("Daffa"); // Error

    }
}
