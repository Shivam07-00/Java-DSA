package Stringlectures;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        // How to create a String
        char str[] = {'a','r','s'};
        String strr = "Shivam Arora";
        String name = new String("Shivam Arora h mera naam");

        // String Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name --> ");
        // Takes input only First Word
        String a = sc.next();

        System.out.println("Enter Your Name --> ");
        // Takes input Full Line
        String c = sc.nextLine();
        System.out.print("Your name is "+a);
        System.out.print("Your name is "+c);

        // String Length
        String fullName = "Tony Stark";
        System.out.println(fullName.length());

        // String Character at

        String newName = "Shivuuu";
        System.out.println(newName.charAt(2));

        for(int i=0;i<newName.length();i++){
            System.out.print(newName.charAt(i)+" ");
        }
    }
}
