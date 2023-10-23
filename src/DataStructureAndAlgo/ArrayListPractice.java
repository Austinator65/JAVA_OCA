package DataStructureAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        DynamicArray dynamic = new DynamicArray();

        // System.out.println(dynamic.capacity);
        ArrayList<String> test = new ArrayList<String>(List.of("Austin", "Atiso", "Mbali", "Thandi", "Teboho"));

        test.add("Andile");
        dynamic.add("A");
        dynamic.add("B");
        dynamic.add("C");
        dynamic.add("D");
        System.out.println("ArrayList" + test + "\n");
        System.out.println(dynamic);
        System.out.println("empty: " + dynamic.isEmpty());
        System.out.println("Size: " + dynamic.size);
        System.out.println("Capacity: " + dynamic.capacity);
    }
}
