package Arrays;

public class BinarySearch {
    public static int binarySearchCode(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,11,14,19};
        int target = 19;
        int ans = binarySearchCode(arr,target);

        if(ans==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println(arr[ans]+" is found at index "+ans);
        }
    }
}
