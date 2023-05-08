import java.util.Scanner;

public class Linear_Search{

    public static int linearSearch(int arr[], int n){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }else{
                System.out.println("Element not found");
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = s.nextInt();
        int arr[] = new int [size];

        System.out.println("Enter array elements");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter Searching Element");
        int n = s.nextInt();

        int result = linearSearch(arr, n);
        System.out.println(result);
    }
}