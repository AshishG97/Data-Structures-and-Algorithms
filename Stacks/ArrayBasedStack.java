package Stacks;

import java.util.Scanner;

public class ArrayBasedStack {
    static int INITIAL_CAPACITY = 5;
    static int size = 0;
    static int capacity = INITIAL_CAPACITY;
    static Integer [] arr = new Integer[INITIAL_CAPACITY];
    static Integer head = null;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        

    }


    private static class Stack{


        public static void push(int data){
            if(isStackFull(size, capacity)){
                expandArray();
            }
            arr[size] = data;
            size++;
            head = arr[size - 1];
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            head = null;
            size--;
            if(size - 1 > -1){
                head = arr[size - 1];
            }
            else{
                head = 0;
            }
        }

        public static void top(){
            System.out.println(head);
        }

        public static int size(){
            return size;
        }

        public static boolean isEmpty(){
            return size == 0;
        }



        private static boolean isStackFull(int size, int capacity){
            return size == capacity;
        }


        private static void expandArray() {

            int[] temp = new int[capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = arr[i];
            }

            capacity = 2*capacity;
            arr = new Integer[capacity];
            for (int i = 0; i < size; i++) {
                arr[i] = temp[i];
            }
        }
    }
}

