package GFG.Strings;

public class BinaryString {

    public static int binarySubstring(int a, String str)
    {

        int counter = 0;
        for (int i = 0 ; i< a; i++){
            char ch = str.charAt(i);
            if(ch == '1') {
                counter++;
            }
        }

        System.out.println(counter);
        if(counter > 1){
            return (int) combination((long) counter,(long)2);
        }else
            return -1;
    }

    public static long combination(long n,long r){
        long m = n;
        return fact(n)/(fact(n-r)*fact(r));
    }

    public static long fact(long n){
        long p = 1;
        for (int i =1; i<= n; i++){
            p = p*i;
        }

        return p;
    }

    public static void main(String[] args) {
        System.out.println(binarySubstring(84,"011110011010110000010110001111000111010111101001010100100011101010111010101001010000"));
    }
}
