package daffa.naufal.fajriansyah.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Daffa", "Naufal", "Fajriansyah"));

        // For loop
//        for (var name : names) {
//            if (name.length() > 5) {
//                names.remove(name);
//            }
//        }

        // Remove if anonymous class
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length() > 5;
//            }
//        });

        // Lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);

    }
}
