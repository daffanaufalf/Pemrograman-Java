package daffa.naufal.fajriansyah.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Daffa");
        stack.offerLast("Naufal");
        stack.offerLast("Fajriansyah");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("\nAntrian:");

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Daffa");
        queue.offerLast("Naufal");
        queue.offerLast("Fajriansyah");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
