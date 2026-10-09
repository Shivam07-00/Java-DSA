package Sorting;

public class BubbleSort {
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;

                }
            }
            if(flag == false){
                break;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {34,23,75,12,97,56,73,24,85};
//        int[] nums = {1,2,3,4,5};
        bubble(nums);
        printArray(nums);
    }
}
