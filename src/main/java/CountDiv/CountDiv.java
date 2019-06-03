package CountDiv;

import java.util.stream.IntStream;

public class CountDiv {

    public int solution(int A, int B, int K) {
        long numberOfIntegersDividedByK = IntStream.rangeClosed(A, B).filter(a -> a % K == 0).count();
        return (int) numberOfIntegersDividedByK;
    }
}
