public class Circle extends Shape{
    private double radius = 1;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color ,boolean filled){
        super(color, filled);
        this.radius = radius;

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
