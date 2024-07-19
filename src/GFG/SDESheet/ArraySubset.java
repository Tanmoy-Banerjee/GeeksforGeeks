package GFG.SDESheet;

import java.util.*;

public class ArraySubset {

    public static String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long, Integer> map= new HashMap<>();

        for(long i : a1){

            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        for(long i : a2){
            if(map.containsKey(i)){
                if (map.get(i) == 1)
                    map.remove(i);
                else {
                    map.put(i, map.get(i)-1);
                }
            }else {
                return "No";
            }
        }


        return "Yes" ;
    }


    public static void main(String[] args) {

        long a1[] = {10, 5, 2, 23, 19};
        long a2[] = {19,5,3};
        System.out.println(isSubset(a1,a2,a1.length,a2.length));
    }
}
