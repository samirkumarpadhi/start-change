package com.go.array;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<Integer>() {
            {
                add(9);
            }
        };
        result.add(0,8);
        System.out.println("result = " + result);
    }

}
