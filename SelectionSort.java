import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size  = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        selectionSort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
    }
}
