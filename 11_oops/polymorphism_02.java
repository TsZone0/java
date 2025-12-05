//function overloading = same name se bhot sare function bane ho to use function overloading kahte hai


class Student{
    String name;
    int age;

    // same function name printInfo
    public void printInfo(String name){
        System.out.println(name);
    }

    // same function name printInfo
    public void printInfo(int age){
        System.out.println(age);
    }

    // same function name printInfo

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class polymorphism_02 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Shivam";
        S1.age = 20;


        //ye input value ke hisab se print karega
        S1.printInfo(S1.age);
        S1.printInfo(S1.name , S1.age);
    }
    
}
