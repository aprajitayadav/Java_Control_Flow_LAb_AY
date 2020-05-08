public class Lab5b {
    public static int evenODD(int num) {
        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        int sum = 0;
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] == num) {
                break;
            } else if (myArray[j] % 2 != 0) {
                System.out.println(myArray[j]);
            } else if (myArray[j] % 2 == 0) {
                sum += myArray[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int answer = evenODD(10);
        System.out.println(answer);
    }
}
