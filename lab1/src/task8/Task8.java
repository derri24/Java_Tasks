package task8;

import java.util.ArrayList;
import java.util.List;

public class Task8 {


    public static void printResult(List<String> result) {
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }

    public static List<String> determinePlace(int[] a, int[] b) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] <= b[j] && a[i + 1] > b[j])
                    results.add("элемент " + b[j] + " между " + a[i] + " и " + a[i + 1]);
        return results;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 7, 10, 45, 76};
        int[] b = new int[]{2, 12, 55, 57};
        printResult(determinePlace(a, b));
    }
}
