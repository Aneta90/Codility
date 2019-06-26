package TwoTeams;

import java.util.Arrays;

public class TwoTeams {

    public int solution(int[] A, int[] B, int F) {

        int sumFromFirstArray=0;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++) {
            if (i % F == 0) {
                sumFromFirstArray += A[i];
            }
        }

        int sumOfSecondArray=0;
        Arrays.sort(B);
        int numberOfBackEndDevelopers = B.length-F;
        for(int i=B.length-1;i>=B.length-numberOfBackEndDevelopers;i--){
            sumOfSecondArray+=B[i];
        }


        return sumFromFirstArray+sumOfSecondArray;

    }

    public static void main(String[] args) {
        int [] A = {4, 2, 1};
        int [] B = {2, 5, 3};
        int F = 2;
        TwoTeams twoTeams = new TwoTeams();
        System.out.println(twoTeams.solution(A,B,F));
    }
}
