package daffa.naufal.fajriansyah.application;

public class EqualsApp {
    public static void main(String[] args) {
        // Equals Method
        String first = "Daffa";
        first = first + " " + "Naufal";
        System.out.println(first);

        String second = "Daffa Naufal";
        System.out.println(second);

        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true

        String third = "Daffa Naufal";

        System.out.println(second == third); // true
        System.out.println(second.equals(third)); // true
    }
}
