package task9;

import java.util.ArrayList;

enum Colors {blue, red, pink, yellow, green, gray, orange, purple}

class Ball {
    private int weight;
    private Colors color;

    Ball(int weight, Colors color) {
        this.weight = weight;
        this.color = color;
    }

    public Colors getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }
}

class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < balls.size(); i++)
            totalWeight += balls.get(i).getWeight();
        return totalWeight;
    }

    public int getCountBlueBalls() {
        int countBlueBalls = 0;
        for (int i = 0; i < balls.size(); i++)
            if (balls.get(i).getColor() == Colors.blue)
                countBlueBalls++;
        return countBlueBalls;
    }
}

public class Task9 {

    public static void main(String[] args) {
        Ball b1 = new Ball(10, Colors.blue);
        Ball b2 = new Ball(11, Colors.gray);
        Ball b3 = new Ball(1, Colors.blue);
        Ball b4 = new Ball(8, Colors.yellow);

        Basket basket = new Basket();
        basket.addBall(b1);
        basket.addBall(b2);
        basket.addBall(b3);
        basket.addBall(b4);

        var totalWeight = basket.getTotalWeight();
        var countBlueBasket = basket.getCountBlueBalls();
        System.out.println("Вес мячиков в корзине: " + totalWeight);
        System.out.println("Количество голубых мячиков в коризне: " + countBlueBasket);
    }

}

