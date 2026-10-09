package Stringlectures;
import java.util.Scanner;

public class palindrome {
    static boolean drome(String s){
        for(int i=0;i<s.length()/2;i++){
            int n = s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        boolean flag = drome(word);

        if(flag){
            System.out.print(word+" is a palindrome");
        }
        else{
            System.out.print(word+" is not a palindrome");
        }

    }
}
