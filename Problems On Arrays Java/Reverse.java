import java.util.*;

class Reverse {
public static void main(String[] args) {
int[] arr = input_array();
System.out.println("below is reversed array :");
Reverse ob = new Reverse();
ob.reverseUsingRecursion(arr, 0, arr.length-1);
ob.display(arr);

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

void display(int[] arr) {
    int i=0;
    while(i<arr.length) {
        System.out.println(arr[i]);
        i++;
    }
}

//method 1 make a new array
int[] reverse(int[] arr) {
    int s = arr.length;
    int [] arr1 = new int[s];
    for(int i=arr.length-1;i>=0;i--) {
arr1[s-i-1] = arr[i];
    }
    return arr1;
}

//method 2 using two pointers
int[] reverseUsingTwoPointer(int[] arr) {
int s = 0;
int e = arr.length-1;
while(s<e) {
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    s++;
    e--;
}
return arr;
}

//method 3 using recursion
int[] reverseUsingRecursion(int[] arr,int s,int e) {
if(s<e) {
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    reverseUsingRecursion(arr, s+1, e-1);
}
return arr;
}

//method 4 using java package library
int[] reverseUsingLibrary(int[] arr) {
    Collections.reverse((Arrays.asList(arr)));
    return arr;
}


}