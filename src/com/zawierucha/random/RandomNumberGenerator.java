package com.zawierucha.random;

import java.util.Random;

public class RandomNumberGenerator {
    int generateInt(int start, int stop) {
        if (start > stop) {
            System.out.println("Error!\nStop must be grater or equal to start!");
            return 0;
        }
        Random generator = new Random();
        return generator.nextInt(stop - start + 1) + start;
    }
}
