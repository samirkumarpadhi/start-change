package com.go.array;

import java.util.Arrays;
import java.util.List;

public class DeleteDuplicates {
    public static int deleteDuplicates(List<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        }
        int writeIndex = 1;
        for (int i = 1; i < A.size(); ++i) {
            if (!A.get(writeIndex - 1).equals(A.get(i))) {
                A.set(writeIndex++, A.get(i));
            }
        }
        System.out.println("A = " + A);

        return writeIndex;
    }
    public static void main(String[] args) {
        System.out.println(" = " + deleteDuplicates(Arrays.asList(2, 3, 5, 5, 7, 11, 11, 11, 13)));
    }
}
