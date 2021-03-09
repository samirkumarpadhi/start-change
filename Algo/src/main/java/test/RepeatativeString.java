package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatativeString {
    static long repeatedString(String s, long n) {
        int sLength = s.length();
        List<Integer> countMap = new ArrayList<>();
        int count = 0;
        for(int i=0;i<sLength;i++) {
            if(s.charAt(i) == 'a') {
                count++;
                countMap.add(count);
            }
            else
                countMap.add(count);
        }
        System.out.println("countMap = " + countMap);
        long div = n/sLength;
        long mod = n%sLength;
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);
        long result = (div*count);
        System.out.println("result = " + result);
        //System.out.println("countMap.get(mod) = " + countMap.get((int) mod-1));
        if(mod>0)
         result =result+countMap.get((int) mod-1);
        System.out.println("result = " + result);
    return result;
    }

    public static void main(String[] args) {
        long result = repeatedString("a", 1000);
    }

}
