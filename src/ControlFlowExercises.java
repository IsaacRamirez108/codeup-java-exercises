public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i++ + " ");
        }

        System.out.println("");

        int a = 2;
        do {
            System.out.println("num: " + a);
            a += 2;
        } while (a <= 100);

    }
}
