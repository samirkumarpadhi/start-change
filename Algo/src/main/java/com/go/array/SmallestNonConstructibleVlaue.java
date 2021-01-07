package com.go.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNonConstructibleVlaue {
    public static void main(String[] args) {
        List<Integer> lst = Arrays. asList(12,2,2,1,152,4);
        System.out.println(smallestConst(lst));
    }

    private static int smallestConst(List<Integer> lst) {
        Collections.sort(lst);
        int maxConstr = 0;
        for(int val : lst){
            if(val>maxConstr+1){
                break;
            }
            System.out.println("Loop "+maxConstr+" val "+val);
            maxConstr+=val;

        }
        System.out.println("Method "+maxConstr);
        return maxConstr+1;
    }
}
