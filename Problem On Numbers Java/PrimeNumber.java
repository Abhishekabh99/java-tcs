import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n)?"Number is Prime Number ": "Number is not a prime number");
    }

   static boolean isPrime(int n) {
        if(n<=1) return false;;

for(int i=2;i*i<=n;i++) {
if(n%i==0) {
    return false;
}
}
return true;
    }
}
