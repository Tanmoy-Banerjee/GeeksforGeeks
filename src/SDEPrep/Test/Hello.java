package SDEPrep.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

        int arr[] = {1,2,3,6,9,13,14};
        ArrayList<Integer>  arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
    }

    public static int  addNumbers(int a, int b){
        return (a+b);
    }
}
