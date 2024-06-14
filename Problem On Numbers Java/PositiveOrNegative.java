import java.util.*;
class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n==0) {
            System.out.println("enter a valid number you must have writted zero ");
          
        } else {
  
        System.out.println(isPositiveOrNegative(n)?"Number is Positive": "Number is Negative");
    }
    }

   static  boolean isPositiveOrNegative(int n) {
        return n>0?true:false;
   }

}
