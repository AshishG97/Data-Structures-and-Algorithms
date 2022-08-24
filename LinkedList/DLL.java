package LinkedList;

public class DLL {
    private static Node head;
    private static  Node tail;
    private static int len;

    public static void main(String[] args) {
       // Call The moethods to run here
    }

    private static void insertAtBack(int data){
        len++;
        Node node = new Node(data);
        if(head == null){
            tail = head = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }


    }

    private static void insertAtBegin(int data){
        len = len + 1;
        Node node = new Node(data);
        if(head == null){
            insertAtBack(data);
            len--;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private static void insertAtPosition(int data, int index){
        len++;
        if(index == 0){
            insertAtBegin(data);
            len--;
        }
        else if(index == len){
            insertAtBack(data);
            len--;
        }
        else if (index > len){
            System.out.println("Index not Accessible");
        }
        else{
            Node temp = head;
            int size = 0;
            while(size < index - 1){
                temp = temp.next;
                size++;
            }
            Node node = new Node(data);
            node.prev = temp;
            node.next = temp.next;
            temp.next = node;
            node.next.prev = node;
        }
    }

    private static void printInOrder(){
        Node node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static class Node{
        private int data;
        private Node next;
        private Node prev;

        private Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        private Node(int data){
            this(data, null);
        }
    }
}
