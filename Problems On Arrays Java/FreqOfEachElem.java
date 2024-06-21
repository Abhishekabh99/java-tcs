import java.util.*;

public class FreqOfEachElem {
    public static void main(String[] args) {
        
int[] arr = input_array();


FreqOfEachElem ob = new FreqOfEachElem();

ob.freqOfEachElemUsingMap(arr);
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
//method 1 kind of sliding window
void feqOfEachElemUsingSlidingWindow(int[] arr) {

    boolean[] visited = new boolean[arr.length];   

for(int i=0;i<arr.length;i++) {
    //skip this element if already visited
    if(visited[i]==true) {
        continue;
    }
    int count = 1;
for(int j=i+1;j<arr.length;j++) {
if(arr[i]==arr[j]) {
    visited[j] = true;
count++;
}
    }
    System.out.println(arr[i]+" Comes "+count+" times ");
}
}
// method 2 using hash maps
void freqOfEachElemUsingMap(int[] arr) {

    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++) {
        if(map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i])+1);
        }
        else {
            map.put(arr[i],1);
        }
    }
    // Traverse through map and print frequencies
    for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " "+entry.getValue());
    }
    
}

}
