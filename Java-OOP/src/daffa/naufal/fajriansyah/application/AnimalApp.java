// Menggunakan Abstract Method
package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.Animal;
import daffa.naufal.fajriansyah.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meng";
        animal.run();
    }
}
