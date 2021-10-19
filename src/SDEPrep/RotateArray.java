package SDEPrep;

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
