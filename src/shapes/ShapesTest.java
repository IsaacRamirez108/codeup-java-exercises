package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.length);
//
//        System.out.println("rectangle.getArea() = " + box1.getArea());
//        System.out.println("rectangle.getPerimeter() = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("rectangle.getArea() = " + box2.getArea());
//        System.out.println("rectangle.getPerimeter() = " + box2.getPerimeter());


        // Exercise 2

        Measurable myShape = new Rectangle(4, 5);

        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

//        myShape = new Square(5);

        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
