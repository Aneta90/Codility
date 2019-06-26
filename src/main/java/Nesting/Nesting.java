package Nesting;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        if (S.length() == 0) {
            return 1;
        }

        if (S.length() % 2 != 0) {
            return 0;
        }

        Stack <Character> integerStack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                integerStack.push(')');

            } else if (S.charAt(i) == ')') {

                if(integerStack.isEmpty()){
                    return 0;
                }

                char temp = integerStack.pop();
                if (temp != S.charAt(i)) {
                    return 0;
                }
            }
        }

        if(integerStack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}
