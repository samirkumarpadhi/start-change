package com.go.array;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class ArrayClassification {
    public  String evenOdd(int[] A) {
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
            //System.out.println("A = " + Arrays.toString(A));
        }
        return Arrays.toString(A);
    }
    public static void main(String[] args) {
        int array[] = { 8,3,9,4,98,77,101 };
        System.out.println("ArrayClassification.main" +new ArrayClassification().evenOdd(array));
    }
}