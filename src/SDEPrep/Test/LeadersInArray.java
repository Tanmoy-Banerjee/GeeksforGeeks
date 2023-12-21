package SDEPrep.Test;

import java.util.ArrayList;

public class LeadersInArray {

    public static void main(String[] args) {

        int arr[] = {63,70,80,33,33,47,20};
        System.out.println(leaders( arr, 7));

    }

    public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
             int num,sum = 0;
             ArrayList<Integer> leader = new ArrayList<>();
        for(int i = 0; i<n; i++){
            num = arr[i]; int index = 0;int count = 0;
            for(int j = i+1; j<n; j++){
                    index++;
                if(num >= arr[j])
                    count++;
            }

            if(count == index ){
                leader.add(num);

            }
             num = 0;
        }

           int index,count = 0;


        return leader;

    }
}
