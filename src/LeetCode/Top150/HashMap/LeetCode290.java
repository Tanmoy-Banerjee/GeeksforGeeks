package LeetCode.Top150.HashMap;

import java.util.*;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.



Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
public class LeetCode290 {

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> patternMap = new HashMap<>();

        boolean flag = true;
        String[] str = s.split(" ");
       // System.out.println(Arrays.asList(str));
        if(pattern.length() != str.length){
            return false;
         }
            for(int i =0; i<str.length; i++){
                char ch = pattern.charAt(i);
                 if(patternMap.containsKey(ch)){
                     if((patternMap.get(ch)).equals(str[i]) == false){
                         return false;
                     }
                 }
                 else{
                     if(patternMap.containsValue(str[i])){
                         return false;
                     }
                     patternMap.put(ch, str[i]);
                 }
            }





        return flag;
    }

    public static void main(String[] args) {
       // wordPattern("abba", "dog cat cat dog");
       ;
        System.out.println( wordPattern("abba", "dog cat cat dog"));
    }
}
