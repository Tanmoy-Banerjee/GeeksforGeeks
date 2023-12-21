package SDEPrep.FiftyInterviewQuestions;

import java.util.ArrayList;

//How do you check if a list of integers contains only odd numbers in Java?
public class checkOddList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(10);

        if(isOddinList(list) == 1){
            System.out.println("All are Odd");
        }else{
            System.out.println(" not all are odd");
        }
    }

    public static int isOddinList(ArrayList<Integer> list){

        int counter = 0;

        for(int i = 0; i<list.size(); i++){

           if(isOdd(list.get(i)) == true){

               counter++;

            }
        }
        if(counter == list.size()){
            return 1;
        }else{
            return 0;
        }
    }

    public static boolean isOdd(int n){

        if(n%2 != 0) {
            return true;
        }
        else
            return false;
    }
}
