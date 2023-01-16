package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("daffa", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}
