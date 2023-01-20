package daffa.naufal.fajriansyah.lambda.app;

import daffa.naufal.fajriansyah.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {

        // Method Reference Static
        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; //

        System.out.println(predicateIsLowerCase.test("daffa"));
        System.out.println(predicateIsLowerCase.test("Daffa"));

        // Method Reference di Parameter
        // Function<String, String> functionUpper = (String vakue) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Daffa"));

    }

    public void run1() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = this::isLowerCase; // Method Reference Non Static

        System.out.println(predicateIsLowerCase.test("daffa"));
        System.out.println(predicateIsLowerCase.test("Daffa"));
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase; // Method Reference Object

        System.out.println(predicateIsLowerCase.test("daffa"));
        System.out.println(predicateIsLowerCase.test("Daffa"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

}
