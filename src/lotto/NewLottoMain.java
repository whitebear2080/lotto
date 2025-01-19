package lotto;

import java.util.List;
import java.util.Random;

public class NewLottoMain {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 1; i < 6; i++) {
            List<Integer> list = random.ints(1, 46)
                    .distinct()
                    .limit(6)
                    .boxed()
                    .sorted()
                    .toList();
            System.out.println(list);
        }
    }
}

