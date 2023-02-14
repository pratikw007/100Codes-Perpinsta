// JAVA Program for calculating the sum of all the elements of an array
public class file_5 {
    public static void main(String[] args) {
        int arr[] = {5,6,1,7};
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
    }
}
