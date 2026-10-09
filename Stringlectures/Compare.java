package Stringlectures;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1==s2){                                     //s1 and s2 dono memory m TONY ko point kr rhe h
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){    //s1 and s3 dono memory m same tony ko print nhi kr rhe h but value toh same h fir bhi we get that they are not equal
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
    }
}
