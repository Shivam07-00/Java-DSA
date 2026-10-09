package Sorting;

public class InsertionSort {
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j = i-1;

            while(j>=0&&arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {34,23,75,12,97,56,73,24,85,102,2};
        insertion(nums);
        print(nums);

    }
}
