import java.util.Scanner;

class SquareRoot{

    public static int squareRoot(int num){
        int low = 0, high = num, result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            long val = mid * mid;

            if(val == num){
              return mid;
            }
            else if(val < num){
                result = mid;
                low = mid + 1;
            }   
            else{
                high  = mid -1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();

        int squareRoot = squareRoot(num);
        System.out.println(squareRoot);
    }
}