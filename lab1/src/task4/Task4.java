package task4;

public class Task4 {
    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void printIndexesPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 16, 13};
        System.out.println("Индексы простых чисел: ");
        printIndexesPrimeNumbers(arr);
    }
}
