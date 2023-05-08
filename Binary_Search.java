import java.util.*;
import java.util.Arrays;
class Binary_Search{

    public static int binarySearch(int arr[], int n){

        int low = 0; 
        int high = arr.length -1;
        

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == n){
                return mid;
            }
            else if(arr[mid] < n){
                low = mid + 1;
            }
            else{
                high = mid -1; 
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);    

        System.out.println("Enter searching element : ");
        int n = s.nextInt();

        int result = binarySearch(arr, n);

        if(result == 0){
            System.out.println("Element not found ");
        }else{
            System.out.println("index " + result);
        }
    }
}