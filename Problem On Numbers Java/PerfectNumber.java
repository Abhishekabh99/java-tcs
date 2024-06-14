import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(isPerfectNumber(n)?"this is a perfect number":"this is not a perfect number ");
    }
static boolean isPerfectNumber(int n) {
    int original = n;
int sum=0;
for(int i=1;i<n;i++) {
if(n%i==0) {
    sum+=i;
}
}
return sum==original?true:false;

}

}
