// Java program for finding the second smallest element in an array
import java.util.*;;
public class file_4 {
     
    static int SecondSmaller(int arr[],int n){

        int smallest = arr[0];

        for (int i = 0; i < n; i++) {
            if(smallest > arr[i])
                smallest = arr[0];
        }
            //  temprarily assinging largest max value 
            int sec_smallest = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if(arr[i] != smallest && arr[i] < sec_smallest)
                    sec_smallest = arr[i];
            }
            return sec_smallest;
        }


    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.println(SecondSmaller(arr,n));
    }
}




















































