package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Daffa", "password");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Daffa"));
        System.out.println(new LoginRequest("Daffa", "password"));

    }
}
