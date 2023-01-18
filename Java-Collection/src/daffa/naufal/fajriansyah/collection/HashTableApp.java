package daffa.naufal.fajriansyah.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Daffa", "Daffa");
        map.put("Andrew", "Andrew");
        map.put("Gugul", "Gugul");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }
}
