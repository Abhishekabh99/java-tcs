import java.util.*;

class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
     int    first_number = sc.nextInt();
        System.out.println("Enter Second Number ");
   int  second_number = sc.nextInt();
   for(int i = first_number;i<=second_number;i++) {
    System.out.print(isPrime(i)?i+" ":"");
   }


    }
   static boolean isPrime(int n) {
    if(n<=1) return true;
    for(int i =2;i*i<n;i++) {
        if(n%i==0) return false;
    }
    return true;
   }


}
