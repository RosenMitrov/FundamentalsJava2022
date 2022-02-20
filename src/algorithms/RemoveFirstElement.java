package algorithms;

public class RemoveFirstElement {
    public static void main(String[] args) {
        int[] numbersArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

        printArray(numbersArray);
        numbersArray = getArrayWithRemovedLastElement(numbersArray);
        printArray(numbersArray);
    }

    private static int[] getArrayWithRemovedLastElement(int[] numbersArray) {
        int[] tempArray = new int[numbersArray.length - 1];
        for (int index = 0; index < tempArray.length; index++) {
            tempArray[index] = numbersArray[index + 1];
        }
        return tempArray;
    }

    private static void printArray(int[] numbersArray) {
        for (int num : numbersArray) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
