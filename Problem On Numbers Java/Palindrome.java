import java.util.*;
class Palindrome {
public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number in Integer"); 

int n = sc.nextInt();

if(isPalin(n)) {
    System.out.println("Number is Palindrome");
} 
else {
    System.out.println("Number is not Palindrome");
}
}
static boolean isPalin(int n) {
    int orignal = n;
int rev = 0;
while(n!=0) {
int last_digit = n%10;
rev = rev*10+last_digit;
n = n/10;
}
return (rev == orignal) ? true : false;
}
}