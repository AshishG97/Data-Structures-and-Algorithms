package LinkedList;

public class SLLGenerics<T> {       // This Class Implements Singly Linked List using Generics in Java


    public static void main(String[] args){    // Main Method of the Class
        list<Integer> list = new list<>();
        list.addToFront(20);
        list.addToFront(21);
        list.addToBack(22);
        list.printLL();
    }

    static class list<T>{        // This Class list consists of Methods to Add and Remove Elements from the Linked List
        private Node<T> head;
        private void addToFront(T data){     // This Method adds element to the front of SLL(Singly Linked List)
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
        }

        private void addToBack(T data){      // This Method adds element to the back of the SLL
            if(head == null){    // If the LL is Empty
                head = new Node<T>(data);
            }
            else{
                Node<T> current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = new Node<T>(data);
            }
        }


        private void removeFromFront(){     // This Method removes the element from the front of SLL
            head = head.next;
        }


        private void removeFromBack(){      // This Method removes the element from the back of the SLL
            if(head == null){
                return;
            }
            else if(head.next == null){
                head = null;
            }
            else{
                Node<T> current = head;
                while(current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }


        private void printLL(){      // This Method prints the SLL Elements
            Node<T> current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
        
        public void removeDuplicates(){     // This methods calls rRemove() method to delete duplicates nodes This methos assumes that the LL is sorted in order
            head = rRemove(head);
        }

        private Node<T> rRemove(Node<T> current){       // This is recursive method that deletes the Duplicate Nodes.
            if(current == null){
                return null;
            }
            current.next = rRemove(current.next);
            if(current.next != null && (current.data.equals(current.next.data))){
                return current.next;
            }
            return current;
        }
    }



    private static class Node<T>{        // This class defines the structure of SLL using GENERICS in Java
        private final T data;
        private Node<T> next;

        private Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        private Node(T data){
            this(data, null);
        }
    }
}
