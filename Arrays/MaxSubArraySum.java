package Arrays2;

public class MaxSubArraySum {
    // Brute Force Approach
    public static int maxSubArraySum1(int[] arr){

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){          // {2,4,6,8,10}
            for(int j=i;j<arr.length;j++){
                int currsum = 0;
                for(int k=i;k<=j;k++) {
                    currsum += arr[k];
                }
                if(currsum>maxSum){
                    maxSum = currsum;
                }

            }
        }
        return maxSum;
    }

    // Kadane's Algorithm
    public static int maxSubArraySum2(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] num = {-2,-3,4,-1,-2,1,5,-3};
        int ans = maxSubArraySum2(num);
        System.out.println("The maximum sum is "+ans);
    }
}
