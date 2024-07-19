package Hashing.HashMap;

import java.util.HashMap;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {



    }

    public HashMap<Integer, Integer> frequency(int arr[]){
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            h.put(arr[i], h.getOrDefault(arr[i],0)+1);
        }
        return h;
    }
}
