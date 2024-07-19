package GFG.SDESheet;

import java.util.ArrayList;

public class SubArraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here

         ArrayList<Integer> arrayList =  subSum(arr, s);
        return arrayList;
    }

    static  int sum = 0;
    static int i = 0;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static ArrayList<Integer> subSum(int arr[],int s ){

//        if(sum == s )
//            return arrayList;
        if(i>arr.length -1){
            arrayList.clear();
            arrayList.add(-1);
            arrayList.add(-1);
            return  arrayList;
        }

        while ( i < arr.length){
            sum = sum + arr[i];
            arrayList.add(i);
            if(sum ==  s){
             ArrayList<Integer> indexArray = new ArrayList<>();
             indexArray.add(arrayList.get(0)+1);
             indexArray.add(arrayList.get(arrayList.size()-1)+1);
             return indexArray;
            }

            else if( sum > s){
                i = arrayList.get(0)+1;
                arrayList.clear();
                sum = 0;
                subSum(arr, s);
            }

            else
                i++;
        }
      return arrayList;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int n = 5;
        int s = 12;


        System.out.println(subarraySum(arr,n,s));
    }
}
