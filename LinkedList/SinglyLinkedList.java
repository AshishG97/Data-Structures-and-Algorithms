package LinkedList;

public class SinglyLinkedList {
    private static Node head;
    public static void main(String[] args){

    }


    private static void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    private static void addToBack(int data){
        if(head == null){    // If the LL is Empty
            head = new Node(data);
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }


    private static void removeFromFront(){
        head = head.next;
    }


    private static void removeFromBack(){
        if(head == null){
            return;
        }
        else if(head.next == null){
            head = null;
        }
        else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }


    private static void printLL(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }


    private static class Node{

        private int data;   // Setting up the data and Node next
        private Node next;

        private Node(int data, Node next){  // Constructor to set the data and Node
            this.data = data;
            this.next = next;
        }

        private  Node(int data){     // Chained Constructor || Overloaded Constructor
            this(data, null);
        }
    }
}
