public class add_last_LL {
    

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

    public static void main(String[] args) {
        add_last_LL l1 = new add_last_LL();
        l1.add_first(5);
        l1.add_first(4);
        l1.add_last(6);
        
    }
}
