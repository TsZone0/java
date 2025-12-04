class Shape{
    String color;
}
class Trangle extends Shape{  // inheritance ka matlab Shape class ka properties le lega ye 
    public void print(int r, int h){
        System.out.println(r*h);
    }
}

class Ractangle extends Trangle {
    public void print(int b,int h, int r){
        System.out.println(r*h*b);
    }

    
}
public class inheritance_03 {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle();
        r1.print(2, 8);
        
        
    
    Trangle T1 = new Trangle();
    T1.color = "Red";

    }
}


// 4 types of inheritence
//1 single inheritence = isme single property use hoga 

// class Parent {}
// class Child extends Parent {}

//2 multilevel inheritence = isme 2 properties use hoga aur extra bhi ad kr sakte hai
// class A {}
// class B extends A {}
// class C extends B {}


//3 Hierarchical Inheritance = multiple child classes.
// class Parent {}
// class Child1 extends Parent {}
// class Child2 extends Parent {}

//4 Multiple Inheritance
// interface A {}
// interface B {}
// class C implements A, B {}
