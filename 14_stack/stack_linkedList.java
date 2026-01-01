class stack_linkedList{
    static class node{
        int data;
        node next;
        
        public node(int data){
            this.data= data;
            next = null;
        }
    }
    
     static class stack2{
         static public node head;
         public static boolean isEmpty(){
             return head == null;
         }
         
        //for push
        public static void push(int data){
            node newNode = new node(data);
            
            if(isEmpty()){
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }
        
        // for pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        // for peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
     }
    
    
    // main function 
    
    public static void main(String[] args){
        stack2 s = new stack2();
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(9);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}