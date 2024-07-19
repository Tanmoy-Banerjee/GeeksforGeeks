package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode12 {

    public String intToRoman(int num) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("I", 1 );
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);




        return "";
    }

    public  void numArray(int num, int digits){
        int arr[] = new int[digits];

    }

    public int findNoOfDigits(int num){
        int m = num; int digits = 0;
        do{
            int r = m %10;
            m = m/10;
            digits++;
        }
        while (m>0);

        return  digits;
    }
}
