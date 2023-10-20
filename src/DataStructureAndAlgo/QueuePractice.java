package DataStructureAndAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Austin");
        queue.offer("Atiso");
        queue.offer("Austinator");
        queue.offer("SiraA");
        queue.offer("Atriano");
        // pool() for dequeue
        // offer() for enqueue
        // ?queue.poll();
        // ?System.out.println(queue.peek());
        // ?System.out.println(queue.isEmpty());
        // ?System.out.println(queue.size());

        System.out.println(queue);

    }

}