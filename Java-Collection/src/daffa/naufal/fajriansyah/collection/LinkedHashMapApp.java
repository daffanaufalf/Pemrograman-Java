package daffa.naufal.fajriansyah.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Daffa");
        map.put("last", "Fajriansyah");
        map.put("middle", "Naufal");

        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }

    }
}
