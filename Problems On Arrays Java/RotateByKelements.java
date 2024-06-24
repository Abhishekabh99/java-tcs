import java.util.Scanner;

public class RotateByKelements {
    public static void main(String[] args) {
        System.out.println("Enter value of k");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int[] arr = input_array();
        RotateByKelements ob = new RotateByKelements();
        ob.rotateByKelemets(arr, 2);

    }
    //method 1 BF approach
    void rotateByKelemets(int[] arr,int k) {
int[] arrNew = new int[arr.length];
for(int i=k;i<arr.length;i++) {
    arrNew[i-k] = arr[i];
    if(i==arr.length-1) {
        for(int j=arr.length-k;i<arr.length;j++) {
            arrNew[j] =arr[j];
            i++;
        }
    }
    display(arrNew);
}
    }
//method 2 using block swap algorithm
    //imput array and display
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
