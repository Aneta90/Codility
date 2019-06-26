package Fish;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B){

        Stack<Integer> fishStack = new Stack();

        int numberOfFishAlived = B.length;
        for(int i=0;i<B.length;i++){

            if(B[i]==1){
                fishStack.push(A[i]);
            }

            if(B[i]==0){

                while(!fishStack.isEmpty()) {

                    if (A[i]<fishStack.peek()){
                        numberOfFishAlived--;
                        break;
                    }

                    else if(A[i]>fishStack.peek()){
                        numberOfFishAlived--;
                        fishStack.pop();

                    }
                }
            }
        }
        return numberOfFishAlived;
    }
}
