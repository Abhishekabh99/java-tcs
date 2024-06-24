import java.util.Scanner;
import java.util.stream.IntStream;

class SumOfElements {
    public static void main(String[] args) {
        SumOfElements ob = new SumOfElements();
        int[] arr = input_array();
        ob.sumOfElementsBF(arr);
        // ob.sumOfElementsUsingLibrary(arr);

    }
//method 1 brute force approach
void sumOfElementsBF(int[] arr) {
    int sum = 0;
    for (int i=0;i<arr.length;i++) {
        sum +=arr[i];
    }
    System.out.println("Sum = "+sum);
}

//method 2 Collections in java 

void sumOfElementsUsingLibrary(int[] arr) {
  int sum =  IntStream.of(arr).sum();
    System.out.println("Sum = "+sum);
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
}