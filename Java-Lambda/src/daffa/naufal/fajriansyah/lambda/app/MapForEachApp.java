package daffa.naufal.fajriansyah.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Daffa");
        map.put("middle_name", "Naufal");
        map.put("last_name", "Fajriansyah");

        // For loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // ForEach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // Lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
