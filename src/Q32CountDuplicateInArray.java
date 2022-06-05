import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q32CountDuplicateInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> m = new HashMap<>();
        System.out.println("Enter elements of an array: ");
        for(int i=0;i< arr.length;i++){
            arr[i] = scn.nextInt();
            if (m.containsKey(arr[i])) {
                m.put(arr[i],m.get(arr[i])+1);
            } else {
                m.put(arr[i],1);
            }
        }
        int cnt = 0;
        for (int val : m.values()){
            if(val>1){
                cnt++;
            }
        }
        System.out.println("Duplicate elements in array are " + cnt);
    }
}
