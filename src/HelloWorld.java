public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString = "Hello, My name is Isaac Ramirez";
        System.out.println(myString);

//        float myNumber = 3.14;
//        System.out.println(myNumber);

        // This block of code will return original int value(x = 5) first. Then increment value by 1 after new value(6)
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // This block of code will increment value by 1 before it is even completed running. both will return(6)
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
//        x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);
//        y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        short tooBig = 32767;
        System.out.println(tooBig);
        tooBig += 1;
        System.out.println(tooBig);
    }
}
