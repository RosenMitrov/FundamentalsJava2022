package algorithms;

public class SortArrayAscendingOrder {
    public static void main(String[] args) {

        int[] numbersArray = new int[]{12, 5, 56, 3, 78, 99, 45, 24, 65, 89, 33, 1};
//                                      0  1   2  3   4   5   6   7   8   9  10  11
        System.out.print("Print initial Array: ");
        printArray(numbersArray);
        //scope of iterations from index 0 to 10 -> zero to penultimate
        for (int index = 0; index < numbersArray.length - 1; index++) {
            int left = numbersArray[index];
            int right = numbersArray[index + 1];
            if (left > right) {
                numbersArray[index] = right;
                numbersArray[index + 1] = left;
                index = -1;
            }
        }
        System.out.print("Sorted ascending order Array: ");
        printArray(numbersArray);
    }

    private static void printArray(int[] numbersArray) {
        for (int num : numbersArray) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
