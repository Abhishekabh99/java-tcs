import java.util.Scanner;

class Reverse {
public static void main() {
int[] arr = input_array();
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