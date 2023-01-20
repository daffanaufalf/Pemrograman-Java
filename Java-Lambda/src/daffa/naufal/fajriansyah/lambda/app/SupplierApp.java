package daffa.naufal.fajriansyah.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Daffa Naufal Fajriansyah";

        System.out.println(supplier.get());

    }
}
