public class Add_eliment_midle {
    

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

    public void add_first(int data){

        //first step
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        //second step
        newNode.next = head;
        
        //theird step
        head = newNode;

    }

// add eliment in a last
    public void add_last(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


// to print the data
     public void print(){
        if(head==null){
            System.out.println("Linked list is empity");
            return;
        }

        Node temp = head;

        while(temp!=null){
            
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
     }

     //add element in middle
      public void add_mid(int idx, int data){
        if(head==null){
            add_first(data);
            return;
        }
         Node newNode = new Node(data); 
         Node temp = head;
         int i=0;
         while(i<idx-1){
            temp = temp.next;
            i++;

         }
         newNode.next = temp.next;
         temp.next = newNode;

      }

    public static void main(String[] args) {
        Add_eliment_midle l1 = new Add_eliment_midle();
        l1.add_first(5);
        l1.add_first(4);
        l1.add_last(6);
        l1.add_last(8);
        l1.add_last(10);
        l1.add_mid(4, 9);
        l1.print();
        
    }
}
