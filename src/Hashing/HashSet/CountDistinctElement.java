package Hashing.HashSet;


import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {

    public static void main(String[] args) {
        int arr[] = {1 , 2 ,3 ,3 ,5 ,6 };
        System.out.println(countDistinct(arr));
    }

   public static int countDistinct(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0 ;i< arr.length; i++){
            if(s.contains(arr[i]) == false){
                s.add(arr[i]);
            }
       }

        return s.size();
    }

}
