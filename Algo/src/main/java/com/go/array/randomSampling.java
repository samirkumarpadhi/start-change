package com.go.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class randomSampling {
    // @include
    public static void randomSampling(int k, List<Integer> A) {
        Random gen = new Random();
        for (int i = 0; i < k; ++i) {
            // Generate a random int in [i, A.size() - 1].
            Collections.swap(A, i, i + gen.nextInt(A.size() - i));
        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(1);list.add(5);
        list.add(4);list.add(0);
        randomSampling(3,list);
    }
}
