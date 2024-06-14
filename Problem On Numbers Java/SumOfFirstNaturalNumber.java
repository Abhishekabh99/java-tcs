import java.util.*;
class SumOfFirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number ;");
int n = sc.nextInt();
System.out.println("Sum of numbers till what you entered"+sum(n));

        
    }
    static int sum(int n) {
        int s=0;
for(int i=1;i<=n;i++) {
    s+=i;
}
return s;
    }
}
