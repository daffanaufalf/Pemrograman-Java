package daffa.naufal.fajriansyah.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Daffa");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Daffa");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Daffa",
                "middle", "Naufal",
                "last", "Fajriansyah"
        );

        // map.put("a", "A"); // Error

    }
}
