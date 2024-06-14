
import java.util.*;

class SumOfGpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter first term of AP :");
        double a = sc.nextDouble();
       System.out.println("Enter comman ratio of AP :");
       double r = sc.nextDouble();
      System.out.println("Enter Number of terms in AP :");
      double n = sc.nextDouble();
      System.out.println("Sum of AP series is "+sum(a,r,n)+" ");
    }
    static double sum(double a,double r,double n) {
        double sum=0;


    sum+= a*(Math.pow(r,n)-1)/(r-1);

return sum;
    }
}
