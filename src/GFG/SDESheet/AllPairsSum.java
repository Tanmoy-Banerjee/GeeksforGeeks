package GFG.SDESheet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

public class AllPairsSum {

    public static pair[] allPairs(int x, int arr1[], int arr2[]) {
        // Your code goes here

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i< arr2.length; i++){
            arrayList.add(arr2[i]);
        }
        ArrayList<pair> listOfPairs = new ArrayList<>();
        for(int i = 0; i< arr1.length; i++){
            if(arrayList.contains(x-arr1[i])){
                //System.out.println(9-arr1[i]);
                pair pair = new pair(arr1[i],x-arr1[i]);
                listOfPairs.add(pair);
            }
        }

       // System.out.println(listOfPairs);
        pair pair[] = new pair[listOfPairs.size()];
        for(int i = 0; i< pair.length;i++){
            pair[i] = listOfPairs.get(i);
        }
      return pair;
    }

    public static void main(String[] args) {

        int arr1[] = {-1, -2, 4, -6, 5, 7};
        int arr2[] = {6, 3, 4, 0};
        int x = 8;

        pair pair[] = allPairs(x,arr1,arr2);

        for (int i = 0; i< pair.length; i++){
            System.out.println(pair[i].first+" "+pair[i].second);
        }

    }


}
