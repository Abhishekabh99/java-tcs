
import java.util.*;

class IncreasingDecreasingOrder {

    public static void main(String[] args) {
IncreasingDecreasingOrder ob = new IncreasingDecreasingOrder();
int[] arr = input_array();
ob.increasingDecreasingUsingLibrary(arr);
    }
    static int[] input_array() {
        System.out.println("Enter size of array :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.println("Enter " + i + " th" + " element of array :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    void display(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
    //method 1 by using library
    void increasingDecreasingUsingLibrary(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++) {
System.out.println(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=arr.length/2;i--) {
            System.out.println(arr[i]);
        }
    }

}
