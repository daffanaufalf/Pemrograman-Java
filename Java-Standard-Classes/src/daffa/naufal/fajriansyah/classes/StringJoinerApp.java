package daffa.naufal.fajriansyah.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Daffa");
        joiner.add("Naufal");
        joiner.add("Fajriansyah");

        String value = joiner.toString();
        System.out.println(value);

    }
}
