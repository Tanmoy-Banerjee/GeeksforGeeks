package SDEPrep.FiftyInterviewQuestions;

//Fact Of Integer
public class FactorialOfInteger {

    public static void main(String[] args) {

        long n = 12;

        System.out.println(findFact(n));
    }

    public static long findFact(long n){

        long p = 1;

        for(int i = 1; i<=n;i++){

            p = p*i;
        }

        return p ;
    }
}
