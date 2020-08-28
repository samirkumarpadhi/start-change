package com.go.hashing;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));

        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }

    /* Driver program to test removeDuplicates */
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        RemoveDuplicate r = new RemoveDuplicate();
        r.removeDuplicates(str);
    }
}
