public class Rectangle extends Shape{
    private double width = 1;
    private double length = 1;

    public Rectangle(){

    }
    public Rectangle(double width,double lenght){
        this.length = lenght;
        this.width = width;
    }
    public Rectangle(double width,double lenght,String color,boolean filled){
       super(color, filled);
        this.length = lenght;
        this.width = width;

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

