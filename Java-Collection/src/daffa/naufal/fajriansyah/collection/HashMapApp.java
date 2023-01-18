package daffa.naufal.fajriansyah.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name.first", "Daffa");
        map.put("name.middle", "Naufal");
        map.put("name.last", "Fajriansyah");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }
}
