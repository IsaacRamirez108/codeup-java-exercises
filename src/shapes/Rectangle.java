package shapes;

public class Rectangle extends Quadrilateral implements Shape{


    public Rectangle(double length, double width){
       super(length, width);
    }
        public double getArea(){
        //return
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    public void setLength(double length){

    }

    public void setWidth(double width){

    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5,4);
//
//        System.out.println(rectangle.length);
//
//        System.out.println("rectangle.getArea() = " + rectangle.getArea());
//        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());
//
//    }



}
