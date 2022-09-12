package task1;

public class Task1 {


    public static double calculateExpression(double x, double y) {
        double numerator = Math.sin(x + y) * Math.sin(x + y) + 1;
        double denominator = 2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)));
        return numerator / denominator + x;
    }


    public static void main(String[] args) {

        System.out.println("Результат вычислений: " + calculateExpression(0.3, 0.8));
    }
}
