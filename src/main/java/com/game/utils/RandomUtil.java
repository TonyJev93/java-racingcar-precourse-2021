package com.game.utils;

import java.util.Random;

public class RandomUtil {

    private static Random random = new Random();

    public static int getRandomNumber(int startNumber, int endNumber) {
        // 임의의 숫자 생성
        return startNumber + random.nextInt(endNumber);
    }

}
