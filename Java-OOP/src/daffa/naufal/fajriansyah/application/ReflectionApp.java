package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.CreateUserRequest;
import daffa.naufal.fajriansyah.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Daffa");
        request.setPassword("password");
        request.setName("Daffa");

        ValidationUtil.validationReflection(request);
    }
}
