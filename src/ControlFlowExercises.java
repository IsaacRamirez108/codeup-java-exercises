public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i++ + " ");
        }

        System.out.println("");

        // int a = 2;
        // do {
        //     System.out.println("num: " + a);
        //     a += 2;
        // } while (a <= 100);

        // Refactoring code above to decrement by 5
        // int a = 100;
        // do {
            // System.out.println("num: " + a);
            // a -= 5;
        // } while (a >= -10);

        int a = 2;
         do {
             System.out.println("num: " + a);
             a *= 2;
         } while (a <= 1000000);

//        for(int a = 2; a <= 100; a++){
//            System.out.println("num: " + a);
//            a += 2;
//        }

    }
}
