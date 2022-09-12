package task5;

public class Task5 {

    public static int findK(int[] arr) {
        int k = 0;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (temp > arr[i])
                k++;
            else
                temp = arr[i];
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 7, 9, 6, 3, 11};
       System.out.println("Число K элементов, которые можно выкинуть из данной последовательности, так чтобы осталась возрастающая подпоследовательность: "+ findK(arr));
    }

}