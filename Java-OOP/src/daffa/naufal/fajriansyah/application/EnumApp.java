package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.Customer;
import daffa.naufal.fajriansyah.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Daffa");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("\nPrint Level");
        for (var value: Level.values()){
            System.out.println(value);
        }

    }
}
