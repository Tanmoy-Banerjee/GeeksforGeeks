package com.company;

public class Combinations {

    public static void main(String[] args) {

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
}
