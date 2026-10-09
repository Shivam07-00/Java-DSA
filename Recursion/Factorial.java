package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial of --> ");
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
