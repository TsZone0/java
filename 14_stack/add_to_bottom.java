import java.util.*;
class add_to_bottom{
   
   public static void addtobottom(Stack<Integer> s , int data){
       if(s.isEmpty()){
           s.push(data);
           return;
       }
       int temp = s.pop();
       addtobottom(s,data);
       s.push(temp);
   }
   
   
   
    public static void main(String[] args){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        addtobottom(s,0);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}