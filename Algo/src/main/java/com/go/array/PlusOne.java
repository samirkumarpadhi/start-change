package com.go.array;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static List<Integer> plusOne(List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }
        if (A.get(0) == 10) {
            // Need additional digit as the most significant digit (i.e., A.get(0))
            // has a carry-out.
            A.set(0, 0);
            A.add(0, 1);
        }
        return A;
    }

    public static void main(String[] args) {

        List<Integer> result = plusOne(new ArrayList<Integer>() {
            {
                add(9);
            }
        });
        System.out.println(result);

        result = plusOne(new ArrayList<Integer>() {
            {
                add(9);
                add(9);
            }
        });
        System.out.println(result);
        assert(result.size() == 3 && result.get(0) == 1 && result.get(1) == 0
                && result.get(2) == 0);

        result = plusOne(new ArrayList<Integer>() {
            {
                add(3);
                add(1);
                add(4);
            }
        });
        System.out.println(result);

        assert(result.size() == 3 && result.get(0) == 3 && result.get(1) == 1
                && result.get(2) == 5);

        result = plusOne(new ArrayList<Integer>() {
            {
                add(9);
                add(9);
                add(9);
            }
        });
        System.out.println(result);

        result = plusOne(new ArrayList<Integer>() {
            {
                add(3);
                add(1);
                add(9);
            }
        });
        System.out.println(result);
    }
}
