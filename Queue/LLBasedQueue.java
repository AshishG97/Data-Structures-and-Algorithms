package Queue;

import java.util.Deque;

public class LLBasedQueue {
    static Node head = null;
    static Node tail = null;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Enque(21);
        Enque(22);
        Deque();
        peek();
        Deque();
        peek();
    }

    public static void Enque(int data){
        if(head == null){
            head = new Node(data);
            tail = head;
        }
        else{
            Node node = new Node(data);
            node.next = null;
            tail.next = node;
            tail = node;
        }
    }

    public static void Deque(){
        if(head == null){
            System.out.println("The LL is Empty");
        }
        else{
            System.out.println(head.data);
            if(head.next != null){
                head = head.next;
            }
            else{
                head = tail = null;
            }
        }
    }

    public static void peek(){
        if(head == null){
            System.out.println("The LL is Empty");
        }
        else{
            System.out.println(head.data);
        }
    }

    public static boolean isEmpty(){
        return head == null;
    }
}
