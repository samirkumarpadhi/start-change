package com.go.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class DutchFlagPartition {
    public static void dutchFlagPartition(int pivotlndex , List<Color> A) {
        Color pivot = A . get(pivotlndex) ;
/** Keep the following invariants during partitioning:
* bottom group: A . subList (SI , smaller)
* middle group: A . subList (smaller , equal).
* unclassified group: A . subList (equal , larger).
* top group: A . subList (larger , A . size ()) */
        int smaller = 0, equal = 0, larger = A.size();
// Keep iterating as long as there is an unclassified element.
        while (equal < larger) {
// A . get (equal) is the incoming unclassified element.
            if (A.get (equal).ordinal () < pivot.ordinal ()){
                Collections.swap (A , smaller++, equal++);
            } else if (A.get(equal).ordinal() == pivot.ordinal()){
                ++equal ;
            } else { // A . get (equal) > pivot.
                Collections.swap(A , equal, --larger);
            }
        }
        System.out.println("pivotlndex = " + pivotlndex + ", A = " + A);
    }
    public static void main(String[] args) {
        List<Color> a = new ArrayList<>();
        a.add(Color.BLUE);
        a.add(Color.WHITE);
        a.add(Color.RED);
        a.add(Color.WHITE);
        a.add(Color.RED);
        a.add(Color.WHITE);a.add(Color.RED);a.add(Color.RED);a.add(Color.BLUE);a.add(Color.RED);a.add(Color.BLUE);a.add(Color.RED);
        DutchFlagPartition.dutchFlagPartition(2,a);
    }
//{"5","8","8","5","7","2","8","5"}
}
