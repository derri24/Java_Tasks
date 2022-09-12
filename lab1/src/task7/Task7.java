package task7;

public class Task7 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] sortArray(int[] arr) {
        int i = 0;
        while (i + 1 < arr.length) {
            if (arr[i] <= arr[i + 1])
                i++;
            else if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i > 0)
                    i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100, 1, 50, 3, 4, 5, 16, 1, 13, -1};
        System.out.println("Исходные данные: ");
        printArray(arr);
        System.out.println("\nДанные после сортировки: ");
        printArray(sortArray(arr));
    }
}

