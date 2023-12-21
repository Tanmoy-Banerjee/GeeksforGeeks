package SDEPrep.FiftyInterviewQuestions;

import java.util.Random;

public class MergeSort {


    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i<10 ; i++){
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before");
        printArray(numbers);
        System.out.println("After");
        mergeSort(numbers);
        printArray(numbers);
    }
    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }
        int midIndex = inputLength/2;

        int[] lefthalf = new int[midIndex];
        int[] righthalf = new int[inputLength - midIndex];

        for(int i = 0; i <midIndex; i++){
            lefthalf[i] = inputArray[i];
        }

        for(int i = midIndex; i <inputLength; i++){
            righthalf[i - midIndex] = inputArray[i];
        }

        mergeSort(lefthalf);
        mergeSort(righthalf);

        merge(inputArray, lefthalf, righthalf);

    }

    private static void merge(int[] inputArray, int[] lefthalf, int[] righthalf){
        int leftSize = lefthalf.length;
        int rightSize = righthalf.length;

        int i = 0;
        int j = 0;
        int k = 0;


        while(i < leftSize && j<rightSize){
            if(lefthalf[i] <= righthalf[j]){
                inputArray[k] = lefthalf[i];
                i++;
            }
            else{
                inputArray[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            inputArray[k] = lefthalf[i];
            i++;
            k++;
        }

        while (j < rightSize){
            inputArray[k] = righthalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int arr[]){

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
