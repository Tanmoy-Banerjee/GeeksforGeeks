package CodingInterview;


import java.util.ArrayList;
import java.util.HashMap;

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

[2,7,11,15]
Hashmap <Sum, Hashset<indexes>>?

2, 0
9, 0,1
20, 0,1,2
35,





 */



class Student{
    int id;

    public  Student(){
        id = 0;
    }
}
public class Question {


    public  static int[]  indexSum(int arr[], int targetSum){

        int result[] = new int [2];
        result[0] = -1;
        result[1] = -1;

       // ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
           //System.out.println(i);
            for(int j = i+1; j< arr.length; j++){
                //System.out.println("j val = "+ j);
                if(arr[i]+ arr[j] == targetSum){
                    result[0] = i;
                    result[1] = j;

                    break;
                }


            }

        }

        return  result;

    }


    public static void main(String[] args) {
//        int arr[]={3,1};
//        int target = 5;
//
//        int result[] = indexSum(arr,target);
//
//        System.out.println(result[0]+" "+ result[1]);

        Student s = new Student();

        s.id = 1;

        System.out.println(s);


    }


}
