public class all {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //add element from a first
    public void add_first(int data){
        Node newNode = new Node(data);
         size++;
        if(head==null){
           
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add from last
    public void add_last(int data){
        Node newNode =  new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }

    //add element in middle
    public void add_mid(int idx, int data){
        if(head==null){
            add_first(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //for printing
        public void print(){
            if(head==null){
                System.out.println("Linked list is empty");
            }
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        //remove element from first
      public int remove_from_f(){
        if(head==null){
            System.out.println("Linked list is empty");
          
        }
        if(size==1){
            head=tail=null;
        }
        int val = head.data;
        head = head.next;
        return val;
      }


   //remove from last
   public int remove_from_last(){
    int val = tail.data;
    if(head==null){
        System.out.println("Linked list is empty");
    }
     Node prev = head;
     for(int i=0; i<size-2; i++){
        prev = prev.next;
     }
     prev.next = null;
     tail = prev;
     size--;
     return val;
   }


    public static void main(String[] args) {
        all t1 = new all();
        t1.add_first(5);
        t1.add_first(4);
        t1.add_first(3);
        t1.add_last(6);
        t1.add_last(7);
        t1.print();
        System.out.println(t1.size);
        t1.remove_from_f();
        t1.print();
        t1.remove_from_last();
        t1.remove_from_last();
        t1.print();
        t1.remove_from_last();
        t1.print();
     
    }
}

