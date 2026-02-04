public class find_and_remove {
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



    //add from first
    public void add_from_first(int data){
        Node newNode = new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

        //remove node from a idx
        public void remove_n(int n){
            int size = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                size++;
            }
            
        }

}
