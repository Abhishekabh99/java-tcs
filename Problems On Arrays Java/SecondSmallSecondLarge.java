import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallSecondLarge {
    public static void main(String[] args) {
        SecondSmallSecondLarge ob = new SecondSmallSecondLarge();
      int[] arr =  input_array();
System.out.println("Second Smallest Number In Array :"+ob.secondSmallest(arr));
System.out.println("Second Largest Number In Array :"+ob.secondLargets(arr));
    }
    static int[] input_array() {
    System.out.println("Enter size of array :");
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int[] arr = new int[s];
    for(int i=0;i<s;i++) {
        System.out.println("Enter "+i+" th"+" element of array :");
        arr[i] = sc.nextInt();
    }
    return arr;
}
int secondSmallest(int[] arr) {
    Arrays.sort(arr);
    return arr[1];
}
int secondLargets(int[] arr) {
    return arr[arr.length-2];
}
}
