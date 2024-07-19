package LeetCode.Top150.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode20 {
    public static  boolean isValid(String s) {
        ArrayDeque<Character> paranthesis = new ArrayDeque<>();
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
           if(paranthesis.isEmpty()){
               paranthesis.push(ch);
           }else if(isMatching(paranthesis.peek(),ch)){
               paranthesis.pop();
           }else {
               paranthesis.push(ch);
           }
        }

        return (paranthesis.isEmpty());
    }

    public static boolean isMatching(char A, char B){
        if((A == '('&& B == ')')||(A =='{'&& B == '}')|| (A == '[' && B ==']')){
            return  true;
        }else {
            return false;
        }
    }
}
