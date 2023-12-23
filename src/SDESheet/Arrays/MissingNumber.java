package SDESheet.Arrays;


import java.util.ArrayList;

//Missing number in array
//        EasyAccuracy: 29.59%Submissions: 963K+Points: 2
//        We know this problem is a piece of cake for you. Challenge yourself with GfG Weekly Contest
//
//        banner
//        Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5};

        System.out.println(missingNumber(arr, 5));

    }

   public static int missingNumber(int array[], int n) {
           int missingNumber = 0;
       // ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i = 1; i<= n; i++){
//            numbers.add(i);
//        }

        for(int i = 0; i<array.length ; i++){
            arrayList.add(array[i]);
        }
   //    System.out.println(numbers + " "+ arrayList);
        for (int i = 1; i<=n ; i++){
            if(arrayList.contains(i) == false){
              //  System.out.println("it enters here");
                missingNumber =i;
            }
        }

        return missingNumber;
    }
}
