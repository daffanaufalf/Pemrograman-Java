package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.annotation.Fancy;
import daffa.naufal.fajriansyah.data.LoginRequest;
import daffa.naufal.fajriansyah.error.ValidationException;
import daffa.naufal.fajriansyah.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "ValidationApp", tags = {"Application", "Java"})
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("daffa", "password");

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid: " + exception.getMessage());
//        } catch (NullPointerException exception){
//            System.out.println("Data null: " + exception.getMessage());
//        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception){
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRunTime(loginRequest2);
        System.out.println("Sukses");

    }
}
