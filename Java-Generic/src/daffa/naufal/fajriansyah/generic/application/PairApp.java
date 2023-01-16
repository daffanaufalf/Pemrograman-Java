package daffa.naufal.fajriansyah.generic.application;

import daffa.naufal.fajriansyah.generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Daffa", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
