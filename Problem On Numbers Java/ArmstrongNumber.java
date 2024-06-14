import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    System.out.println(isArmstrong(n)?"this is an armstrong number":"this is not an armstrong number");

    }

   static boolean isArmstrong(int n) {
int size = String.valueOf(n).length();
int orignal = n;
int sum=0;
while(n>0) {
    int last_digit = n%10;
sum += Math.pow(last_digit,size);
n = n/10;
}
return sum==orignal?true:false;
    }
  
}