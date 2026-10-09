package Arrays;

public class LargestElement {
    public static int search(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] num = {1,6,2,3,9,4,0};
        int ans = search(num);
        System.out.println(ans);
    }
}
