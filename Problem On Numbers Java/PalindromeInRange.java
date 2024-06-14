import java.util.*;
public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter First Number :");
  int first_number = sc.nextInt();
  System.out.println("Enter Second Number :");
  int last_number = sc.nextInt();
  for(int i=first_number;i<=last_number;i++) {
System.out.print(isPalin(i)?i+" ":"");
  }

    }

//check palindrome
static boolean isPalin(int n) {
    int orignal = n;
    int rev = 0;
    while(n!=0) {
        int last_digit = n%10;
        rev = rev*10+last_digit;
        n=n/10;
    }
    return rev==orignal?true:false;
}

//input array 
static int[] input_array() {
    Scanner sc = new Scanner(System.in);
    int s;
    System.out.println("Enter how many numbers you want to enter : ");
    s= sc.nextInt();
int[] arr = new int[s];
for(int i=0;i<s;i++) {
System.out.println("Enter "+i+" number : ");
arr[i] = sc.nextInt();
}
return arr;
}

}
