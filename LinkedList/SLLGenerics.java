package LinkedList;

public class SLLGenerics<T> {


    public static void main(String[] args){
        list<Integer> list = new list<>();
        list.addToFront(20);
        list.addToFront(21);
        list.addToBack(22);
        list.printLL();
    }

    static class list<T>{
        private Node<T> head;
        private void addToFront(T data){
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
        }

        private void addToBack(T data){
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


        private void removeFromFront(){
            head = head.next;
        }


        private void removeFromBack(){
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


        private void printLL(){
            Node<T> current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }



    private static class Node<T>{
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
