package com.go.number;

public class Reverse {
    public static long reverse (int x) {
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0) {
            System.out.println("result = " + result);
            System.out.println("xRemaining = " + xRemaining);
            result = result * 10 + xRemaining % 10;
            xRemaining /= 10;

        }
        return x < 0 ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1132));

        //System.out.println(reverse(121));
        //System.out.println(reverse(590));

    }

}
