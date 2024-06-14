import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
int n = sc.nextInt();
System.out.println((leap(n))?"This year is leap year ":" This year is not leap year");
    }

    static boolean leap(int n) {
if(n%4==0) {
    return true;
}
if(n%100==0) {
    if(n%400==0) {
        return true;
    }
}
return false;

    }
    
}
