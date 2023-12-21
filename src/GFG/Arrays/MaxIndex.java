package GFG.Arrays;

public class MaxIndex {



    public static int maxIndexDiff(int A[], int N) {

        int maxDiff = 0;

        for(int i = 0;i < N; i++ ){
            for(int j = N-1 ; j>=0 ;j--){
                if(A[j]>=A[i] && j-i > maxDiff){
                    maxDiff = j-i;
                }
            }
        }

        return maxDiff;

    }
}
