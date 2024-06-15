import java.util.*;
class LargestNoInArray {

    public static void main(String[] args) {
        int[] arr = input_array();
        System.out.println("Largest array is "+ largest(arr));

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
    static int largest(int[] arr) {
int max=arr[0];
for(int i=0;i<arr.length;i++) {
    if(arr[i]>max) {
        max= arr[i];
    }
}
return max;
    }
    static int largetsFromLibrary(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        return arr[l-1];
    }
}