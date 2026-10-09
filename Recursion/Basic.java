package Recursion;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print --> ");
        int n = sc.nextInt();
        print(n);
        printa(n);
    }

    static void print(int n){       //
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static void printa(int n){
        if(n==0){
            return;
        }
        printa(n-1);
        System.out.println(n);

    }
}
