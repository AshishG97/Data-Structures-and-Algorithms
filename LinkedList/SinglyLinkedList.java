package LinkedList;

public class SinglyLinkedList {     // This class shows hoe Singly Linked List is Implemented in Java
    private static Node head;
    public static void main(String[] args){
        // Call Methods to run here
    }

    // This Method add a Node to Front of the Single Linked List
    private static void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // This Method adds a Node to the Back of the Singly Linked List
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

     // This Method Removes the Node from the front of a Singly Linked List
    private static void removeFromFront(){
        head = head.next;
    }

    // This Method Removes the Node from the Back of the Singly Linked List
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

     // This Method Prints all The Elements of the Singly Linked List
    private static void printLL(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }


        // This is The Node Class to define the Structure of the Node it consists of two Constructors and 2 variables;
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
