import java.util.Scanner;

public class GreatestOfThreeNumbers {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println("Greatest number is "+greatest(a, b, c));







}

static int greatest(int a,int b,int c) {
 if(a==b & b==c) System.out.println("wrong input"); 
if(a>b&&a>c) return a;
if(b>a&&b>a) return b;


return c;

}



}
