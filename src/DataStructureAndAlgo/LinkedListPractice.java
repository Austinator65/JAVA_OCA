package DataStructureAndAlgo;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.push("Austin");
        list.push("Atiso");
        list.push("Mpho");
        list.push("Ofentse");

        list.offer("Sthe");
        list.offer("Lebo");
        list.poll();

        list.add(4, "Neo");
        list.remove("Ofentse");

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("France");
        list.removeLast();

        System.out.println(list);
    }
}