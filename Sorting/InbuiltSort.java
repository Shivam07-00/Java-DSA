package Sorting;
import java.util.*;
public class InbuiltSort {
    public static void main(String[] args) {
        Integer[] nums = {35,62,12,9,69,100,1,22};
        Arrays.sort(nums,Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
