// Java Program for Finding the Smallest and largest element in an array
public class file_3 {
    
    public static void main(String[] args) {
        int arr[] = {10,55,86,59,26,2,88,969,56};

        int largest = arr[0];
        int Smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // for largest number
            if(largest > arr[i]){
                largest = arr[i];
            }
            
            // for smallest number
            if(Smallest<arr[i]){
                Smallest = arr[i];
            }
        }
        
        System.out.println("The Smallerst Number is :"+Smallest);
            System.out.println("The Largest number is : "+ largest);
    }
    
}
