import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void print(int n, int el) {
        for (int i = 0; i < n-el; i++){
            System.out.print(" ");
        }
        for (int i = 0; i < el; i++){
            System.out.print("#");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            print(n, i);
        }
    }
}
