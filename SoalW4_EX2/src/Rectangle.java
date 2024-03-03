public class Rectangle extends Shape {
    
    // Deklarasi variabel dengan access modifier private
    private double width;
    private double length;
    
    // 1st Constructor tanpa parameter
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    
    // 2nd Constructor dengan dua parameter
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    // 3rd Constructor dengan empat parameter
    public Rectangle(double width, double length, String color, boolean filled){
        //Memanggil constructor superclass Shape dengan parameter color dan filled
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    // Method getter
    public double getWidth(){
        return width;
    }
    
    // Method setter
    public void setWidth(double width){
        this.width = width;
    }
    
    // Method getter
    public double getLength(){
        return length;
    }
    
    // Method setter
    public void setLength(double length){
        this.length = length;
    }
    
    // Method getArea() akan mengembalikan nilai luas persegi panjang
    public double getArea(){
        return width * length;
    }
    
    // Method getPerimeter() akan mengembalikan nilai keliling persegi panjang
    public double getPerimeter(){
        return 2 * (width+length);
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Rectangle
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a subclass of "+super.toString();
    }
}