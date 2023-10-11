package org.example.Easy;

import java.math.BigInteger;
import java.util.List;

public class Climbing_Stairs {

    public static void main(String[] arg){

        System.out.println((climbStairs(35)));




    }
    public static int climbStairs(int n) {
        int [] fibonacciList = {
                1,
                1,
                2,
                3,
                5,
                8,
                13,
                21,
                34,
                55,
                89,
                144,
                233,
                377,
                610,
                987,
                1597,
                2584,
                4181,
                6765,
                10946,
                17711,
                28657,
                46368,
                75025,
                121393,
                196418,
                317811,
                514229,
                832040,
                1346269,
                2178309,
                3524578,
                5702887,
                9227465,
                14930352,
                24157817,
                39088169,
                63245986,
                102334155,
                165580141,
                267914296,
                433494437,
                701408733,
                1134903170,
                1836311903, 0
        };
        return fibonacciList[n];

    }
    public static BigInteger getFactorial(int f) {
        if (f <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return BigInteger.valueOf(f).multiply(getFactorial(f - 1));
        }
    }
}
