package com.go.array;
import java.util.Arrays;
public class ArrayClassification {
    public static void evenOdd(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while (nextEven < nextOdd) {
            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                System.out.println("nextOdd = "+nextOdd);
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                int oddVal = nextOdd--;
                A[oddVal] = temp;
                System.out.println("oddVal = " + oddVal);
            }
            System.out.println("A = " + Arrays.toString(A));
        }

    }
    public static void main(String[] args) {
        int array[] = { 8,3,9,4,98,77,101 };
        ArrayClassification.evenOdd(array);
    }
}