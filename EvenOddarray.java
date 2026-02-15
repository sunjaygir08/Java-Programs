public class EvenOddarray {
    public static void main(String[] args) {
        int[] data = {10, 3, 16, 1, 27, 98, 5, 112, 65, 8, 13, 123, 190};

        System.out.print("Even numbers: ");
        for (int num : data) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : data) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
