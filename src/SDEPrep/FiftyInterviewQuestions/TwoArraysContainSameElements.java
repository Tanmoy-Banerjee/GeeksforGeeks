package SDEPrep.FiftyInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysContainSameElements {


    public static void main(String[] args) {

        int a[] = {1,2,3,2,1};
        int b[] = {1,2,3};

        System.out.println(checkSameEle(a,b));
    }


    public static boolean checkSameEle(int[] A, int[] B){
        boolean status = Arrays.equals(A,B);
           return status;
            }
        }



