package com.go.number;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(int x) {
        if (x < 0) {
            return false;
        }
        final int numDigits = (int)(Math.floor(Math.log10(x))) + 1;
        int msdMask = (int)Math.pow(10, numDigits - 1);
        System.out.println(msdMask);
        for (int i = 0; i < (numDigits / 2); ++i) {
            System.out.println("PalindromeNumber.isPalindromeNumber"+msdMask);
            if (x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask; // Remove the most significant digit of x.
            x /= 10; // Remove the least significant digit of x.
            msdMask /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(42524));
    }

}
