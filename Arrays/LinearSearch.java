package Arrays;

public class LinearSearch {
    public static int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1,3,4,5,6,2,8,9};
        int key = 23;

        int result = search(numbers,key);

        if(result==1){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }

    }
}
