package SDEPrep.FiftyInterviewQuestions;

//Implement binary search in Java
public class BinarySearch {

    public static void main(String[] args) {

        int arr [] = {1,3,5,8,11,17,19,22,29,35};

        if(binarySearch(arr,17) != -1)
            System.out.println("Found pos = " + binarySearch(arr,5) );
        else

            System.out.println("Not Found");
    }

    public static int binarySearch(int arr[], int ele){

        int l = 0; int r = arr.length -1;
        while(l <= r ){

            int m = (l + r ) / 2;

            if(arr[m]==ele)
                return m;

            if(arr[m]< ele)
                l = m +1;

            else
                r = m-1;

        }

        return -1;

    }
}
