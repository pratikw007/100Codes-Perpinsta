public class PrimeNumber {

    // Check Whether a Given Number is Prime or Not in Java

//     Prime Number
// A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers. 
// A natural number greater than 1 that is not prime is called a composite number. For example,
//  5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.

public static void main(String[] args) {
    CheckPrime(15);
 }

private static void CheckPrime(int n){
            int  count = 0;
            if(n<2){
                System.out.println("The given is number" + n + "is not prime");
                for (int i = 1; i <= n; i++) {
                        if(n%i == 0)
                            count = count +1;
                        if(count > 2){
                            System.out.println("The given is number" + n + "is not prime");
                        }else{
                            System.out.println("The given is number" + n + "is prime");
                        }
                }
            }
}

}
