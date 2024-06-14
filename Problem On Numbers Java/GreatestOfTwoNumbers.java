import java.util.*;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers : ");
        a= sc.nextInt();
        b= sc.nextInt();
  System.out.println(greater(a, b)); 
 
    }
    static int greater(int a,int b) {
        if(a==b) {
            System.out.println("wrong input");
        }
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
}
