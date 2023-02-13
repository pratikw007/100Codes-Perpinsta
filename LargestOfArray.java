public class LargestOfArray {
    
    public static void main(String[] args) {
        int arr[] = {10,50,26,56,3,85,56,24};
           int max = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
