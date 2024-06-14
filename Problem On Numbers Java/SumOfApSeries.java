
import java.util.*;
class SumOfApSeries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
      System.out.println("Enter first term of AP :");
      int a = sc.nextInt();
     System.out.println("Enter comman difference of AP :");
       int d = sc.nextInt();
    System.out.println("Enter Number of terms in AP :");
    int n = sc.nextInt();
    System.out.println("Sum of AP series is "+sum(a,d,n)+" ");


    }
static int sum(int a,int d,int n) {
    int sum=0;
  
sum+= (n * (2 * a + (n - 1) * d)) / 2;
 
    return sum;
}

}
