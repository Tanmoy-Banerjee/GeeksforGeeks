package SDEPrep.FiftyInterviewQuestions;

public class FactorialofAnumber {

    public static void main(String[] args) {


        System.out.println(factorial(20));
    }

    public static long factorial(long n){
        if(n == 1)
            return 1;

        else
            return (n* factorial(n-1));

    }
}
