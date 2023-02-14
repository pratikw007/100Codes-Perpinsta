// Java Code for finding the Smallest Element in an Array
public class SmallestNoOfArray {
 
    public static void main(String[] args) {
        int arr[] = {10,25,63,56,34,95,5};
       int min = arr[0];

       for (int i = 0; i < arr.length; i++) {

        if(min>arr[i]){
            min = arr[i];
        }
       }
       System.out.println(min);

    }
}
