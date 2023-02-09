public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5, "red", false);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());
        Rectangle rectangle = new Rectangle(3.8, 2.5, "green", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());
        Square square = new Square(6.6);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());


    }
}
class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }


    public String toString() {
        return "Shape[color='" + color +"',filled=" + filled + "]";
    }
}

class Circle extends Shape{
    private double radius = 1;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color ,boolean filled){

        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double d = Math.PI *  Math.pow(radius,2);
        String str = "" + d + "0000000";
        int n = str.indexOf(".");
        str = str.substring(0,n + 3);
        d = Double.valueOf(str);
        return d;
    }
    public double getPerimeter(){

        double d = 2 * Math.PI * radius;
        String str = "" + d + "0000000";
        int n = str.indexOf(".");
        str = str.substring(0,n + 3);
        d = Double.valueOf(str);
        return d;

       
    }
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + radius+"]";
    }
}

class Rectangle extends Shape{
    protected double width = 1;
    protected double length = 1;

    public Rectangle(){

    }
    public Rectangle(double width,double lenght){
        this.length = lenght;
        this.width = width;
    }
    public Rectangle(double width,double lenght,String color,boolean filled){
        this.length = lenght;
        this.width = width;
        this.color = color;
        this.filled = filled;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
       double d = width * length;
       String str = "" + d + "0000000";
       int n = str.indexOf(".");
       str = str.substring(0,n + 3);
       d = Double.valueOf(str);
       return d;
    }
    public double getPerimeter(){
        return (2*width) + (2*length);
    }
    public String toString(){
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}

class Square extends Rectangle{
    protected double side;
   public  Square(){

    }
    public Square (double side){
       this.side = side;
        this.width =side;
        this.length = side;
    }
    public Square(double side,String color,boolean filled ){

       this.side = side;
       this.color = color;
       this.filled = filled;
    }

    public double getSide(){
       return side;
    }
    public void setSide(double side){
       this.side = side;

    }
    public void setWidth(double width){
       this.width = width;
    }
    public void setLength(double length){
       this.length = length;
    }
    public String toString(){
       return "Square["+ super.toString() + "]";
    }

}
