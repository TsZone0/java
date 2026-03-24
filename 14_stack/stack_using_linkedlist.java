package Stack;


import java.util.LinkedList;

public class stack_using_linkedlist {
        static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;

            }
        }
        static class stacks {
            public static Node head = null;
            public static Node tail = null;

            public static void push(int data){
                Node newNode = new Node(data);
                if(head==null){
                    head = newNode;
                    tail = newNode;

                }
                newNode.next = head;
                head = newNode;
            }

            public static void pop(){
                if(head == null){
                    System.out.println("Stack Empty");
                    return;
                }

                head = head.next;
            }

            public static void peek(){
                System.out.println(head.data);
            }
        }

    public static void main(String[] args) {
            stacks s3 = new stacks();
            s3.push(8);
            s3.push(11);
            s3.push(78);
            s3.push(4);
            s3.push(61);
            s3.push(98);
            s3.peek();
            s3.pop();
            s3.peek();

    }

}
