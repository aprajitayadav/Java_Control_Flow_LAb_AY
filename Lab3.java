//import java.util.Scanner;

public class Lab3 {

    public static void main(final String args[]) {
        int i = 0;

        int[] myArray = new int[30];
        System.out.print("Initializing the array values to position and displaying the same!");
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.print("Array element " + (i + 1) + " value is : " + myArray[i] + "\n");
        }
        int j = 2;
        i = 0;
        System.out.print("Initializing the array values to even number starting 2 and displaying the same!");
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = j;
            System.out.print("Array element " + (i + 1) + " value is : " + myArray[i] + "\n");
            j = j + 2;
        }
        System.out.print("Displaying the array in reverse order using enhanced for!");

        int[] reverseArray = new int[30];
        int k = 29;

        for (i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = myArray[k];
            // System.out.print(" Reverse Array element " + (i + 1) + " value is : " +
            // reverseArray[i] + "\n");
            k = k - 1;
        }

        for (int item : reverseArray) {
            System.out.print(item + "\n");
        }

    }
}

/*
 * declare an integer array with 30 elements - `int[] myArray = new int[30];`
 * 
 * with a `for` loop, initialize the array with the same number as the index.
 * [0] = 0, [1] = 1, etc. print out the contents of each element of the array
 * using an enhanced `for`
 * 
 * with a `for` loop, reassign the elements of the array with the even numbers"
 * up to 60. print out the contents of each element of the array using an
 * enhanced `for` print the contents of the array in reverse order.
 */