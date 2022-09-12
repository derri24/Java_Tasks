package task2;

public class Task2 {
    public static boolean checkPoint(double x, double y) {
        x = Math.abs(x);
        if ((y <= 5 && y >= 0 && x >= 0 && x <= 4)
                || (y >= -3 && y <= 0 && x >= 0 && x <= 6))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Результат попадания в область: " + checkPoint(-3, 4));
    }

}
