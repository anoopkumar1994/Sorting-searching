import java.util.*;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    j--;
                }
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

        insertionSort(arr);
        System.out.println("sorted array is : " + Arrays.toString(arr));
    }
}
