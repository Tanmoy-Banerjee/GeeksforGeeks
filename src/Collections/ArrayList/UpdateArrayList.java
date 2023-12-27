package Collections.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Write a Java program to update an array element by the given element.
public class UpdateArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i<= 1000; i++){
            Random rand = new Random();
            numbers.add(rand.nextInt());
        }

        numbers.set(9,23);

        for(Integer i : numbers){
            System.out.print(i+" ");
        }

        //search an element
        Collections.sort(numbers,Collections.reverseOrder());

        System.out.println();
        for(Integer i : numbers){
            System.out.print(i+" ");
        }

    }

}
