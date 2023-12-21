package SDEPrep.FiftyInterviewQuestions;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a value");

        System.out.println(isPrime(ob.nextInt()));

    }

    private static boolean isPrime(int n){
        int counter = 0;
        for (int i = 1; i<=n; i++){
             if (n%i ==0){
                 counter++;
             }
        }
        if(counter == 2){
            return true;
        }else{
            return false;
        }
    }
}
