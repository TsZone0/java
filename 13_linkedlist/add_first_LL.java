public class add_first_LL {
    

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
    public static void main(String[] args) {
        add_first_LL l1 = new add_first_LL();
        l1.add_first(5);
    }
}
