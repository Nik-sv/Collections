package COLLECTIONS;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);    // head pe element ko add kar deta hai
        adq.offerLast(45);    // offerFirst and last dono hi aaye hai arrray deque
        adq.offer(26);


        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


        System.out.println(adq.poll());
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("PollFirst() " + adq);


        System.out.println(adq.pollLast());
        System.out.println("pollLast()" +adq);


    }
}
