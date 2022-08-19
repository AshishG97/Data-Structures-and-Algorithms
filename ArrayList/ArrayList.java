package ArrayList;

import java.util.Scanner;

public class ArrayList {
    static int INITIAL_CAPACITY = 5;
    static int size = 0;
    static int capacity = INITIAL_CAPACITY;
    static Integer [] arr = new Integer[INITIAL_CAPACITY];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Call The Methods to run here
    }

    // This program will add elements at the End of the ArrayList
    private static  void insertAtBack(){
        System.out.println("Enter the number to insert at the back");
        int toInsert = sc.nextInt();
        if(isArrayFull(size, capacity)){
           expandArray();
        }
        arr[size] = toInsert;
        size += 1;
    }

    //  This program will add elements at the beginning of the ArrayList
    private static void insertAtStart(){
        System.out.println("Enter the number to insert at the start");
        int toInsert = sc.nextInt();
        if (size != 0) {
            for (int i = size; i > 0; i--) {
                if (isArrayFull(size, capacity)) {
                    expandArray();
                }
                arr[i] = arr[i - 1];
            }
        }
        arr[0] = toInsert;
        size++;
    }

    //  This program will add elements at the specific index of the ArrayList
    private static void insertAtIndex(){
        System.out.println("Enter the number to insert");
        int toInsert = sc.nextInt();
        System.out.println("Enter the Index");
        int atIndex = sc.nextInt();
        if(size + 1 < atIndex){
            System.out.println("Please utilise previous places");
        }
        if(size == 0){
            System.out.println("You are inserting your first element that's why it will be inserted at the first position");
            arr[0] = toInsert;
        }
        else{
            for(int i = size; i > atIndex; i--){
                if(isArrayFull(size, capacity)){
                    expandArray();
                }
                arr[i] = arr[i - 1];
            }
            arr[atIndex] = toInsert;
        }
        size++;

    }

    // This removes the last element from the Array
    private static void removeLast(){
        Integer removed = arr[size - 1];
        System.out.println("Removing " + removed + " From the ArrayList");
        arr[size - 1] = null;
        size--;
    }

    // This removes the First element from the Array
    private static void removeFirst(){
        System.out.println("The Removed Element is " + arr[0]);
        for(int i = 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    // This removes the numbers from a specific index from the ArrayList
    private static void removeFromIndex(){
        System.out.println("Enter the index to remove number at that index");
        int fromIndex = sc.nextInt();
        System.out.println("The removed number is " + arr[fromIndex]);
        for(int i = fromIndex; i < size; i++){
            arr[i] = arr[i + 1];
        }
        arr[size] = null;
        size--;
    }

    // Print the ArrayList elements
    private static void printArray(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }

    // Checks if ArrayList is Full or not
    private static boolean isArrayFull(int size, int capacity){
        return size == capacity;
    }

    
    // Increases the size of the ArrayList
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
