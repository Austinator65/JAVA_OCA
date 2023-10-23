package DataStructureAndAlgo;

public class recusion {

    public static void main(String[] args) {
        // walk(5);
        walkInrecursion(5);
    }

    private static void walkInrecursion(int steps) {
        if (steps < 1)
            return;// base case
        System.out.println("You take a step!");
        walkInrecursion(steps - 1);// recursive case
    }

    /*
     * private static void walk(int steps) {
     * for (int i = 0; i < steps; i++) {
     * System.out.println("You took a step!");
     * }
     * }
     */
}
