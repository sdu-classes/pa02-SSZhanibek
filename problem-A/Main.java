public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("jsdc");
        System.out.println(c);
        c.greets();


    }
}
class Animal {
    protected String name;

    public Animal(String name ){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Animal[" + name + "]";
    }
}
class Mammal extends Animal{


    public Mammal(String name) {
        super(name);
    }
    @Override
    public String toString(){
        return "Mammal[" + super.toString() + "]";
    }
}
class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }



}
class Cat extends Mammal{

    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
