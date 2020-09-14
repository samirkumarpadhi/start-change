package lambdasinaction.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise {

    public static void square() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);
    }
    public static void numberPair() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        //numbers1.stream().flatMap( i -> numbers2.stream().map(j->new int[]{i,j}) ).collect(Collectors.toList()).forEach(arrayElement -> System.out.println(arrayElement[0]+" "+arrayElement[1]));
        List<int[]> pairStram = numbers1.stream().flatMap( i -> numbers2.stream().map(j->new int[]{i,j}) ).collect(Collectors.toList());
        pairStram.forEach(arrayElement -> System.out.println(arrayElement[0]+" "+arrayElement[1]));
        System.out.println("=================================================================");
        List<int[]> pairParallelStram = numbers1.parallelStream().flatMap( i -> numbers2.stream().map(j->new int[]{i,j}) ).collect(Collectors.toList());
        pairParallelStram.forEach(arrayElement -> System.out.println(arrayElement[0]+" "+arrayElement[1]));
        System.out.println("=================================================================");
    }

    public static void numberPairExtended() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        //numbers1.stream().flatMap( i -> numbers2.stream().map(j->new int[]{i,j}) ).collect(Collectors.toList()).forEach(arrayElement -> System.out.println(arrayElement[0]+" "+arrayElement[1]));
        List<int[]> pairStram = numbers1.stream().flatMap( i -> numbers2.stream().filter(j->(i+j)%3==0).map(j->new int[]{i,j}) ).collect(Collectors.toList());
        pairStram.forEach(arrayElement -> System.out.println(arrayElement[0]+" "+arrayElement[1]));
    }

    public static void findFirst() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst();
        System.out.println(firstSquareDivisibleByThree.get());
        Optional<Integer> firstSquareDivisibleByThree2 = someNumbers.stream().filter(x -> (x*x)%3==0).findFirst();
        System.out.println("2 "+firstSquareDivisibleByThree2.get());
    }

    public static void main(String[] args) {
    square();
    numberPair();
    numberPairExtended();
        findFirst();
    }
}
