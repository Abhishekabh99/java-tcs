import java.util.*;
class AvgOfElements {
    public static void main(String[] args) {
        int[] arr = input_array();
        AvgOfElements ob = new AvgOfElements();
        ob.AvgOfElements(arr);
    }
// Method 1 BF Approachq
void AvgOfElements(int[] arr) {
float size = arr.length;
float sum =0;

for(int i=0;i<size;i++) {
    sum +=arr[i];
  
}
float avg = sum/size;
System.out.println("Average of elements of array "+ avg);

}

    // display and input array
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
    void display(int[] arr) {
        int i=0;
        while(i<arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}