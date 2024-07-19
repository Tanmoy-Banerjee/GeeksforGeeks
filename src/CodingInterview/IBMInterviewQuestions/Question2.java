package CodingInterview.IBMInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
int arr contains any numbers including duplicates
print int the sorterOrder;
 */
public class Question2 {


    public static  void  printArray(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            if(arrayList.contains(arr[i]) != true){
                arrayList.add(arr[i]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 5, 5, 6, 7, 7};

        printArray(arr);
    }
}
