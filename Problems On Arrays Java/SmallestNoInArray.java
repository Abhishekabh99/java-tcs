import java.util.*;

class SmallestNoInArray {

public static void main(String[] args) {
    int arr1[] = input_array();
// System.out.println(smallest(arr1));
System.out.println(smallestThroughLib(arr1));

}
static int smallest(int[] arr) {
    int min = arr[0];
for(int i=0;i<arr.length;i++) {
    if(arr[i]<min){
        min = arr[i];
    }
}
return min;
}

static int smallestThroughLib(int[] arr) {
    Arrays.sort(arr);
    return arr[0];
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