package daffa.naufal.fajriansyah.util;

import daffa.naufal.fajriansyah.annotation.NotBlank;
import daffa.naufal.fajriansyah.data.LoginRequest;
import daffa.naufal.fajriansyah.error.BlankException;
import daffa.naufal.fajriansyah.error.ValidationException;

import java.lang.reflect.Field;
import java.util.Objects;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRunTime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // Validated
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}

