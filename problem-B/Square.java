public class Square extends Rectangle{
    private double side;
    public  Square(){

    }
    public Square (double side){
        this.side = side;


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
        this.setWidth(side);
        this.setWidth(side);

    }
    public void setWidth(double width){
        setSide(width);

    }
    public void setLength(double length){

        this.setSide(length);
    }
    public String toString(){
        return "Square["+ super.toString() + "]";
    }

}

