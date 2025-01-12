package lotto;

import java.util.List;
import java.util.Random;

public class PowerBallMain {
    public static void main(String[] args) {
        printPowerBallNumber(5);
    }

    private static void printPowerBallNumber(int cnt) {
        Random random = new Random();
        for (int i = 1; i <= cnt; i++) {
            List<Integer> list = random.ints(1, 29)
                    .distinct()
                    .limit(5)
                    .boxed()
                    .sorted()
                    .toList();
            int powerBall = random.ints(1, 10).limit(1).sum();
            System.out.println("NormalBall : " + list + ", PowerBall : " + powerBall);
        }
    }

}

