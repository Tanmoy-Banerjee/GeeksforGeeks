package GFG.DynamicProgramming;

public class Memoization {


    static int memo[] ;

    public Memoization(int n){
        for(int i = 0; i<n; i++){
            memo[i] = -1;
        }
    }
    public  int fib (int n){

        if(memo[n] == -1){
            int rec;
            if(n == 0|| n ==1)
                rec = n;
            else
                rec = fib(n-1)+ fib(n-2);

            memo[n] = rec;
            return rec;
        }else {
            return memo[n];
        }
    }


    public static void main(String[] args) {

      Memoization ob =   new Memoization(10);
        System.out.println(ob.fib(10));
    }
}
