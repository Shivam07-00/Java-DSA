package Arrays;

public class ReverseAnArray {
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] num = {3,5,10,2,7,6};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
