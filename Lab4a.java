public class Lab4a {
    public static void main(final String args[]) {
        int[] myArray = new int[30];
        int i = 0;

        // Step 01 : While loop for initializing the array

        while (i < 30) {
            myArray[i] = i;
            System.out.print("Array element " + (i + 1) + " value is : " + myArray[i] + "\n");
            i++;
        }

        // Step 02 : While loop for assigning the even values to array
        int j = 2;
        i = 0;
        while (i < 30) {
            myArray[i] = j;
            System.out.print("Array element even " + (i + 1) + " value is : " + myArray[i] + "\n");
            i++;
            j = j + 2;
        }

        // Step 03 : While loop for revering values to array

        int[] reverseArray = new int[30];
        i = 0;
        while (i < 30) {
            reverseArray[i] = myArray[reverseArray.length - 1 - i];
            System.out.print("Array element reverse " + (i + 1) + " value is : " + reverseArray[i] + "\n");
            i++;
        }
    }
}
