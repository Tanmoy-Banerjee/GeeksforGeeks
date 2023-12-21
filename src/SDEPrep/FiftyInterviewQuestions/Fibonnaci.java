package SDEPrep.FiftyInterviewQuestions;

//Write a Java program to print a Fibonacci sequence using recursion.
public class Fibonnaci {

    public static void main(String[] args) {

        printFibo(1000);

    }

    public static void printFibo(int limit){

        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1 ; i <= limit; i++){
            System.out.println(a);
            a = b;
            b = c;
            c = a+b;

        }
    }
}
