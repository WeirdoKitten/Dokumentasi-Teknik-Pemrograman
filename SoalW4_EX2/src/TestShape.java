public class TestShape { 
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println("Shape : " + "Color = " + shape.getColor() + " Filled = " + shape.isFilled());
        System.out.println(shape.toString() + "\n");
        
        // Membuat Object Circle
        Circle circle = new Circle(4.0, "black", true);
        System.out.println("Circle : " + "Area = " + circle.getArea() + " Perimeter = " + circle.getPerimeter());
        System.out.println(circle.toString() + "\n");
        
        // Membuat Object Rectangle
        Rectangle rectangle = new Rectangle(6.0, 9.0, "gray", true);
        System.out.println("Rectangle : " + "Area = " + rectangle.getArea() + " Perimeter = " + rectangle.getPerimeter());
        System.out.println(rectangle.toString() + "\n");
        
        // Membuat Object Square
        Square square = new Square(8.0);
        System.out.println("Square : " + "Area = " + square.getArea() + " Perimeter = " + square.getPerimeter());
        System.out.println(square.toString() + "\n");
    }
}