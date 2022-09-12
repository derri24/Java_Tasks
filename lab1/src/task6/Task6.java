package task6;

public class Task6 {

    public static void printResult(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public static int[] shift(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (i + 1 < arr.length)
                arr[i] = arr[i + 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[][] createMatrix(int[] arr) {
        int[][] matrix = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                matrix[i][j] = arr[j];
            arr = shift(arr);
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printResult(createMatrix(arr));

    }
}
