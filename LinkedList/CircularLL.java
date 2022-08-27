package LinkedList;

public class CircularLL {
    private static Node head;
    private static Node tail;

    private static int size;

    public static void main(String[] args){
        insertAtBack(0);
        insertAtBack(1);
        insertAtBack(2);
        display();
        removeFromIndex(2);
        display();
    }

    private static void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            tail.next = head;
        }
        else{
            tail.next = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    private static void insertAtBack(int data){
        Node node = new Node(data);
        if(head == null){
            insertAtStart(data);
        }
        else{
            tail.next = node;
            node.next = head;
            tail = node;
            size++;
        }

    }

    private static void insertAtIndex(int data, int index){
        if(index == 0){
            insertAtStart(data);
        }
        else if(index == size){
            insertAtBack(data);
        } else if (index > size) {
            System.out.println("This is Invalid. index is greater than size of the linked list");
            return;
        }
        else{
            Node node = new Node(data);
            Node temp = head;
            int len = 0;
            while(len < index - 1){
                temp = temp.next;
                len++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    private static void removeFromStart(){
        if(head == null){
            System.out.println("Insert First");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            tail.next = head.next;
            head = head.next;
            size--;
        }
    }

    private static void removeFromLast(){
        if(head == null){
            System.out.println("Insert First");
            return;
        }
        else if(head == tail){
            removeFromStart();
        }
        else{
            Node temp = head;
            while(temp.next.next != head){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            size--;
        }
    }

    private static void removeFromIndex(int index){
         if(index >= size){
            System.out.println("Invalid Index");
        }
        else if(index == 0 || head == tail){
            removeFromStart();
        }
        else if(head == null){
            System.out.println("Insert First");
            return;
        }

        else if(index == size - 1){
            removeFromLast();
        }

        else{
            Node temp = head;
            int len = 0;
            while(len < index - 1){
                temp = temp.next;
                len++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    private static void display(){
        Node current = head;
        if(head == null){
            System.out.println("There is no element to show");
            return;
        }
        while(current.next != head){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }

    private static class Node{
        Node next;
        int data;

        private Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        private Node(int data){
            this(data, null);
        }

    }
}
