package lotto;

import java.util.*;

public class LottoMain {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(createNumber()));
        }
    }

    private static int[] createNumber() {
        int[] lotto = new int[6];
        Random random = new Random();

        // 랜덤번호 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            // 중복번호 제거
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        // 오름차순 정렬
        for (int i = 0; i < lotto.length; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        return lotto;
    }
}