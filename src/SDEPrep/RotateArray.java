package SDEPrep;

//Rotate Array
//        Basic Accuracy: 59.87% Submissions: 100k+ Points: 1
//        Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
//
//        Input:
//        The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
//
//        Output:
//        For each testcase, in a new line, output the rotated array.
//
//        Constraints:
//        1 <= T <= 200
//        1 <= N <= 107
//        1 <= D <= N
//        0 <= arr[i] <= 105
//
//        Example:
//        Input:
//        2
//        5 2
//        1 2 3 4 5
//        10 3
//        2 4 6 8 10 12 14 16 18 20
//
//        Output:
//        3 4 5 1 2
//        8 10 12 14 16 18 20 2 4 6
//
//        Explanation :
//        Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.


import java.util.Scanner;

public class RotateArray {


    public static void main(String[] args) {


        Scanner ob = new Scanner(System.in);
        int testcases = ob.nextInt();
        ob.nextLine();
        for (int t = 0 ; t< testcases; t++){


             String s = ob.nextLine();
             String arr[] = s.split(" ");

             int size = Integer.parseInt(arr[0]);
             int d = Integer.parseInt(arr[1]);

           // int size = Integer.parseInt(arr[0]);
           // int d = Integer.parseInt(arr[1]);
          //  String s1 = ob.next();
          //  String arr1[] = s1.split(" ");


           // System.out.println(rotateArray(arr1,d));
           String array = ob.nextLine();
           String  inputArr[] = array.split(" ");

            int rotateArr[] = rotateArray(inputArr,d);


            for (int i= 0; i< rotateArr.length; i++)
            {
                System.out.print(rotateArr[i] + " ");
            }
            System.out.println(" ");
        }



    }


    public static int [] rotateArray(String[] arr, int d){

         int rotatedArray[] = new int [arr.length];
         int j = 0; int m =0;
        for (int i = 0; i< arr.length; i++){

                  if( i <d)
                  {
                     rotatedArray[arr.length  -d +m] = Integer.parseInt(arr[i]);
                     m++;

                  }
                  else {
                      rotatedArray[j] = Integer.parseInt(arr[i]);
                      j++;

                  }



        }

        return rotatedArray;
     }
}
