package SDEPrep.FiftyInterviewQuestions;

// How do you sort an array in Java?

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, -1, -2, 4};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
