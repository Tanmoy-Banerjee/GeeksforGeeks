package CodingInterview.IBMInterviewQuestions;

public class Fibonacci {

    public static  void printFibbonacci(int n){
        int a = 0; int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i<n; i++){
             int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }


    public static void main(String[] args) {
        printFibbonacci(12);
    }


}
