import java.util.Arrays;
import java.util.Scanner;

//Time complexity = O(n^2)
//Space complexity = O(1)
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n =  arr.length;
      for(int i = 0; i<n; i++){
        boolean swapped = false;
        for(int j = 0; j<n-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
      }
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

        bubbleSort(arr);
        System.out.println("sorted array is : " + Arrays.toString(arr));
    }
}
