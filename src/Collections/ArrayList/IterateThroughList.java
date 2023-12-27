package Collections.ArrayList;

import java.util.ArrayList;

public class IterateThroughList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i<= 1000; i++){
            numbers.add(i);
        }

        for(Integer i : numbers){
            System.out.print(i+" ");
        }
    }
}
