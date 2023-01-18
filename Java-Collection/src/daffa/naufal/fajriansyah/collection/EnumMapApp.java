package daffa.naufal.fajriansyah.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Level;

public class EnumMapApp {

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Daffa");
        map.put(Level.VIP, "Naufal");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }
}
