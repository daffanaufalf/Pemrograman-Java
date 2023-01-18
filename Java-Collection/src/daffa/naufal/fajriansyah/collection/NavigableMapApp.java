package daffa.naufal.fajriansyah.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Daffa", "Daffa");
        map.put("Andrew", "Andrew");
        map.put("Gugul", "Gugul");
        
        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Daffa"));
        System.out.println(map.higherKey("Daffa"));
        System.out.println(map.floorKey("Ignatius"));
        System.out.println(map.ceilingKey("Ignatius"));

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Daffa", "Daffa"); // Error

    }
}
