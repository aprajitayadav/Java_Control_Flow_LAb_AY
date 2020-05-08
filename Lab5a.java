public class Lab5a {
    public static int evenODD(int no) {
        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] == no) {
                break;
            } else if (myArray[j] % 2 != 0) {
                continue;
            } else if (myArray[j] % 2 == 0) {
                System.out.println(myArray[j]);
            }
        }
        return no;
    }

    public static void main(String[] args) {
        int answer = evenODD(23);
        System.out.println("Execution stopped at " + answer);
    }
}