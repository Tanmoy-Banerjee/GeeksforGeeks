package CodingInterview;
//array n no of elements
public class Question1 {

    public static  boolean whetherPallindrome(int arr[]){

        int check =0;
        for (int i= 0; i<arr.length; i++){
            if(checkPallindrome(arr[i]) == true){
                check++;
            }else {
                return false;
            }
        }

        if( check == arr.length)
            return true;
            else
                return false;

    }


    public static  boolean checkPallindrome(int n){

        int m =n; int rev = 0;

        do{
            int r = m%10;
            m = m/10;

            rev = rev *10 + r;
        }while (m>0);

        if(rev == n)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int arr[] = {121, 11};
        int arr1[] =  {11,121, 35};


        System.out.println(whetherPallindrome(arr1));
    }
}
