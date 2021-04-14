public class Lexicographic {

    public static boolean isInIncreasingOrder(int numbers[]) {
        if (numbers.length <= 1) {
            return false;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void reverse(int[] numbers, int indexAtIplus1) {
        int indexAtEndOfArray = numbers.length - 1;
        while (indexAtIplus1 < indexAtEndOfArray) {
            int temp = numbers[indexAtIplus1];
            numbers[indexAtIplus1] = numbers[indexAtEndOfArray];
            numbers[indexAtEndOfArray] = temp;
            indexAtIplus1++;
            indexAtEndOfArray--;
        }
    }

    public static void swap(int[] numbers, int indexAtI, int indexAtJ) {
        int temp = numbers[indexAtI];
        numbers[indexAtI] = numbers[indexAtJ];
        numbers[indexAtJ] = temp;
    }

    public static void print(int[] numberArray) {
        // int numberArray[] = {5,10,15,20};

        while (isInIncreasingOrder(numberArray)) {
            int indexI = 0;
            int indexJ = 0;

            for (int i = numberArray.length - 2; i >= 0; i--) {
                if (numberArray[i] < numberArray[i + 1]) {
                    indexI = i;
                    break;
                }
            }

            for (int j = numberArray.length - 1; j >= 0; j--) {
                if (numberArray[j] > numberArray[indexI]) {
                    indexJ = j;
                    break;
                }
            }

            swap(numberArray, indexI, indexJ);
            reverse(numberArray, indexI + 1);

            for (int i = 0; i < numberArray.length; i++) {
                System.out.print(numberArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numberArray[] = {5, 10, 15, 20};
        print(numberArray);
    }
}
