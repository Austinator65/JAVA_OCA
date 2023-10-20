package DataStructureAndAlgo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuesPractice {
    public static void main(String[] args) {

        Queue<Integer> marks = new PriorityQueue<>();

        marks.offer(2);
        marks.offer(5);
        marks.offer(9);
        marks.offer(6);
        marks.offer(8);

        while (!marks.isEmpty()) {
            System.out.println(marks.poll());
        }
    }
}
