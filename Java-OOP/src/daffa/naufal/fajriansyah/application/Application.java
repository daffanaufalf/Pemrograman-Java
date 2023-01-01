package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.*; // Import Semua Package

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro M1", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
