import java.util.*;
public class file_8 {
        public static void main(String[] args) { 
    
           //Initialize array 
           int [] arr = new int [] {10, 40, 30, 20}; 
           int temp = 0; 
    
           //Sort the array in ascending order 
           for (int i = 0; i < arr.length; i++) { 
               for (int j = i+1; j < arr.length; j++) {
                 if(arr[i] > arr[j]){ 
                     temp = arr[i]; 
                     arr[i] = arr[j]; 
                     arr[j] = temp; 
                  } 
               } 
           } 
    
    
        //Displaying elements of array after sorting 
        for (int i = 0; i < arr.length; i++) { 
         System.out.print(arr[i] + " "); 
       } 
      } 
    }
    

    // -------------------------------------------------------------


// // function to sort the array
// static void printOrder(int[] arr, int n)
// {
// // sorting the array
// Arrays.sort(arr);

// // printing first half in ascending order
// for (int i = 0; i < n ; i++)
// {
// System.out.print(arr[i] + " ");
// }

// }

// // Driver code
// public static void main(String[] args)
// {
// int[] arr = {10, 30, 40, 20};
// int n = arr.length;
// printOrder(arr,n);
// }
// }
