package Queue;

import java.util.Scanner;

public class ArrayBasedQueue{
    static Scanner sc = new Scanner(System.in);
    static int capacity;
    static int front = 0;
    static int back = 0;
    static int size = 0;
    static int [] arr;

    public static void main(String[] args) {
        System.out.println("Enter the capacity of the Queue");
        capacity = sc.nextInt();
        arr = new int[capacity];

        Enqueue(1);
        Enqueue(2);
        System.out.println(Deque());
        System.out.println(Deque());
        System.out.println(peek());
        System.out.println(isEmpty());
    }

    public static void Enqueue(int data){
        if(size == capacity){
            System.out.println("The Queue is full, you need to DEQUE it to insert " + data);
        }
        else{
            System.out.println("The data inserted is " + data);
            back = (front + size) % capacity;
            arr[back] = data;
            size++;
        }
    }

    public static int Deque(){
        if(isEmpty()){
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public static int peek(){
        if(isEmpty()){
          return -1;
        }
        return arr[front];
    }

    public static boolean isEmpty(){
        return size == 0;
    }
}


