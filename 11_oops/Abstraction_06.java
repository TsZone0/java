// abstract ke bare me soch sakte hai but vo exist nahi karta hai jaise human,animal,students
//use nahi kar sakte hai
// jaise animal ak concept hai

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("animals can eat");
    }
    
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks with 2 legs ");
    }
}
public class Abstraction_06 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
    
}
