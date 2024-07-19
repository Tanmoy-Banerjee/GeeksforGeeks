package GFG.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParamthesis {

    public static boolean matching(char a, char b){
        return ((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
    }

    public static boolean isBalanced(String s){
        ArrayDeque<Character> input = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '{'||ch=='('||ch =='['){
                input.push(ch);
            }else {
                if(input.isEmpty() == true)
                    return false;
                else if (matching(input.peek(),ch)==false)
                    return false;
                else
                    input.pop();
            }
        }

        return (input.isEmpty() ==true);
    }

    public static void main(String[] args) {
        ArrayDeque<Character> input = new ArrayDeque<>();
        String s = "{[())]}";

        System.out.println(isBalanced(s));
    }
}
