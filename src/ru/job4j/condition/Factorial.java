package ru.job4j.condition;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int k = 1; k <= n; k++) {
            result = result * k;
        }
        return result;
    }
}
