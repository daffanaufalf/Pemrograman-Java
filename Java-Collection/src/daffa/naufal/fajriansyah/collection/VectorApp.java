package daffa.naufal.fajriansyah.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Daffa");
        list.add("Naufal");
        list.add("Fajriansyah");

        for (var value : list) {
            System.out.println(value);
        }

    }
}
