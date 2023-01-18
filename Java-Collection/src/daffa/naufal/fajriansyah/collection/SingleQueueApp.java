package daffa.naufal.fajriansyah.collection;

import daffa.naufal.fajriansyah.collection.data.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Daffa"));
        System.out.println(queue.offer("Naufal"));
        System.out.println(queue.offer("Fajriansyah"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

    }
}
