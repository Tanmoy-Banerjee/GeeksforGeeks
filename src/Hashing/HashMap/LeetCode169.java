package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode169 {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Float> map = new HashMap<Integer, Float>();
        for(int i = 0 ; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i]) +1.0F));
            }else{
                map.put(nums[i], 1.0F);
            }
        }
        Float ratio = nums.length /2.0F ;
        int num = 0;
        Set<Map.Entry<Integer, Float>> entrySet = map.entrySet();

        for(Map.Entry<Integer, Float> entry: entrySet){
            if(entry.getValue() > ratio ){
                num = entry.getKey();
            }
        }

        return  num;

    }
}
