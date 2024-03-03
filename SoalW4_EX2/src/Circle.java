// Class Circle turunan dari class Shape
public class Circle extends Shape{
    // Deklarasi variabel dengan access modifier private
    private double radius;
    
    // 1st Constructor tanpa parameter
    public Circle() {
        radius = 1.0;
    }
    
    // 2nd Constructor dengan satu parameter
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // 3rd Constructor dengan tiga parameter
    public Circle(double radius, String color, boolean filled) {
        //Memanggil constructor superclass Shape dengan parameter color dan filled
        super(color, filled);
        this.radius = radius;
    }
    
    // Method getter
    public double getRadius() {
        return radius;
    }
    
    // Method setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method getArea() akan mengembalikan nilai luas lingkaran
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    // Method getPerimeter() akan mengembalikan nilai keliling lingkaran
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Circle
    @Override
    public String toString(){
        return "A Circle with radius = "+radius+", which is a subclass of "+super.toString();
    }
}