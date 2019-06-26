package Brackets;

import java.util.Stack;

public class Brackets {

    public int solution(String S){

        Stack<Character> bracketsChar = new Stack<>();

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                bracketsChar.push(')');
            }
            else if(S.charAt(i) == '['){
                bracketsChar.push(']');
            }
            else if(S.charAt(i) == '{'){
                bracketsChar.push('}');
            }

        else if (S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}') {

                if (bracketsChar.isEmpty()) {
                    return 0;
                }

                else {
                    char topCharacterFromStack = bracketsChar.pop();
                    if(topCharacterFromStack != S.charAt(i)){
                        return 0;
                    }
                }
            }

            }

        if(bracketsChar.isEmpty()){
            return 1;
        } else {

            return 0;

        }
    }
}
