package LeetCode.Top150.HashMap;

import java.util.*;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

 */
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if(map.containsKey(sortedString) == false ){

                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);

        }

        result.addAll(map.values());
        return  result;
    }

    public boolean isAnagram(String s1, String s2){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(char ch : s1.toCharArray()){
            set1.add(ch);
        }
        for(char ch : s2.toCharArray()){
            set2.add(ch);
        }

        return  set2.equals(set1);
    }
}
