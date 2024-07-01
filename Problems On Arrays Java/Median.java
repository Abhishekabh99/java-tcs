import java.util.Arrays;
import java.util.Scanner;

class Median {

    public static void main(String[] args) {
int[] arr = input_array();
Median ob = new Median();
ob.median(arr);

    }

    void median(int[] arr) {

Arrays.sort(arr);

if(arr.length%2==0) {
    int ind1 = (arr.length / 2) - 1;
		int ind2 = (arr.length / 2);
		System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
}
else {
    System.out.print(arr[(arr.length / 2)]);
}

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
}