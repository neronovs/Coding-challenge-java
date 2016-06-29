import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        int minSize = arr[0];
        int count = arr.length;
        System.out.println(count);
        
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == minSize) {
                count--;
            } else { 
                System.out.println(count);
                count--;
                minSize = arr[a];
            }
            if (count == 0) break;
        }
    }
}
