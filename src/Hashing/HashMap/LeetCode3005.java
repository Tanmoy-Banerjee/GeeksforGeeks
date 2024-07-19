package Hashing.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.



Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.

 */
public class LeetCode3005 {

    public static int  maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i ++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
              map.put(nums[i],1);
            }
        }

        int maxFrquency = Collections.max(map.values());
        int frequency = 0;
        for(int i = 0; i< nums.length; i++){
            if(map.get(nums[i]) == maxFrquency){
                frequency++;
            }
        }

        return  frequency;
    }
//
//    public static void main(String[] args) {
//        int nums[] = {1,2,2,3,1,4};
//        HashMap<Integer, Integer> map = maxFrequencyElements(nums);
//
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//
//        for(Map.Entry<Integer, Integer> entry: entrySet){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//    }

}
