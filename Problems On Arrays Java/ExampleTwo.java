import java.util.*;
class ExampleTwo {
    public static void main(String[] args) {
        int[] arr = input_array();
        int curr = arr[0];
        for(int i=0;i<arr.length;i++) {
           if( curr < arr[i])
           {
            arr[i] = curr;
           }
            
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
             
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