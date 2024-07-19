package GFG.DynamicProgramming;
import java.util.*;
public class MovingTotal{

    /**
     * Adds/appends list of integers at the end of internal list.
     */
    static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void append(int[] list) {
        // remove this exception throw and start your implementation


        for(int i = 0; i< list.length-2; i++){
            // int sum = 0;
            // for(int j = flag ; j <flag + 3 ; j++){
            //       sum = sum + list[j];
            // }
            // arr.add(sum);
            // flag++;
            // sum = 0;

            int sum = 0;
            sum = list[i] + list[i+1] + list[i+2];
            arr.add(sum);

        }






        // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public static boolean contains(int total) {

        if(arr.contains(total) == true)
            return true;
        else
            return false;
        // remove this exception throw and start your implementation
        // throw new UnsupportedOperationException("Waiting to be implemented.");
    }


    public static void main(String[] args) {

        int arr[]= {1,2,3,4};
        append(arr);

        System.out.println(contains(6));
    }
}
