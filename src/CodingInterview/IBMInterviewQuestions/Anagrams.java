package CodingInterview.IBMInterviewQuestions;

import java.util.Arrays;

public class Anagrams {

    public static  boolean isAnagram(String s, String t){
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();


        Arrays.sort(a);
        Arrays.sort(b);

      return   Arrays.equals(a,b);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "hert"));
    }
}
