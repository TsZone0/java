 import java.util.*;

public class function {

    public static void print_my_name(String name){
            System.out.println("hello"+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        print_my_name(name);
    }
    
}
