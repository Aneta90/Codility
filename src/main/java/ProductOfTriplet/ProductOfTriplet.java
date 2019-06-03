package ProductOfTriplet;

import java.util.Arrays;

public class ProductOfTriplet {

    public int solution(int[]A) {
        Arrays.sort(A);
        return Math.max(A[A.length-1]*A[A.length-2]*A[A.length-3],A[A.length-1]*A[0]*A[1]);

    }
}
