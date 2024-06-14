
import java.util.*;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
    System.out.println(isEvenOrOdd(n)?"Number is Even":"Number is Odd");
    }
   static boolean isEvenOrOdd(int n) {
if(n%2==0) {
    return true;
}
return false;

    }
}
