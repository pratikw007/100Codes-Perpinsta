public class LinearSearch {

    static int linearSearch(int a[], int n, int val) {  
       // Going through array sequencially  
       for (int i = 0; i < n; i++){  
             if (a[i] == val)  
             return i+1;  
         }  
       return -1;  
     }  


     // -1

     public static void main(String args[]) {  
       int a[] = {55, 29, 10, 40, 57, 41, 20, 24, 45}; 

       int val = 10; 
         
       int n = a.length; 
        
       int res = linearSearch(a, n, val); // Store result  
       if (res == -1)  
       System.out.println("Element is not present in the array");  
       else  
       System.out.println("Position "+ res);  
    //    System.out.println();
     }  
     }  
