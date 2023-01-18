package daffa.naufal.fajriansyah.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Daffa");
        stack.push("Naufal");
        stack.push("Fajriansyah");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }

    }
}
