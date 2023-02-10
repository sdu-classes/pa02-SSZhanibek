

public class Main {
    public static void main(String[] args) {



    }
}
class Person{
    protected String name;
    protected String address;

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return "Perosn[name=" + name + ",adderss=" + address + "]";
    }

}
class Studet extends Person{
    private String program;
    private int year;
    private double fee;


    public Studet(String name ,String address,String program,int year, double fee){
        super(name, address);
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String toString(){
        return "Studen[" +
    }

}