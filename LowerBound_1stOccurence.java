import java.util.Arrays;
import java.util.Scanner;

public class LowerBound_1stOccurence {

    public static int lowerBound(int arr[], int n){
        int low =0, high = arr.length-1, result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == n){
                result = mid;
                high = mid - 1;
            }
            else if(arr[mid] > n){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array element : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter seraching element : ");
        int n = s.nextInt();

        int result = lowerBound(arr,n);
        if(result == -1){
            System.out.println("Index not found");
        }else{
            System.out.println("index " + result);
        }
    }
    
}
