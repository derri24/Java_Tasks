package task3;

public class Task3 {
    public static void createTable(double a, double b, double h) {
        while (a <= b) {
            System.out.println(a + " | " + Math.tan(a));
            a += h;
        }
    }

    public static void main(String[] args) {
        System.out.println("x | F(x) ");
        createTable(4, 10, 2);
    }
}
