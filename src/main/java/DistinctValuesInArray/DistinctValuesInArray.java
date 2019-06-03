package DistinctValuesInArray;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class DistinctValuesInArray {

    Set<Integer> integerSet = new HashSet<>();

    public int solution(int[] A) {

        for(Integer integer:A){
            integerSet.add(integer);
        }
        return integerSet.size();
    }

    public int solution2(int[]A){
        return (int) IntStream.of(A).distinct().count();
    }

}
