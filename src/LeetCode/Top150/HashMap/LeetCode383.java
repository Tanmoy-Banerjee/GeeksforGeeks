package LeetCode.Top150.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class LeetCode383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> ransomeMap = new HashMap<>();

        for(int i = 0 ; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i = 0 ; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            System.out.println(ch);
            if(ransomeMap.containsKey(ch)){
                System.out.println("Enters here");
                ransomeMap.put(ch,ransomeMap.get(ch)+1);
            }else{
                System.out.println("Enters hererer");
                ransomeMap.put(ch,1);
            }
        }

        System.out.println(map);
        System.out.println(ransomeMap);
       boolean flag = true;
        Set<Map.Entry<Character,Integer>> entrySet = ransomeMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet){
            if(map.containsKey(entry.getKey())){
                if(map.get(entry.getKey()) >= entry.getValue()){
                    continue;
                }else{
                    return  false;
                }
            }else{
                return false;
            }
        }

        return flag;

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }


}
