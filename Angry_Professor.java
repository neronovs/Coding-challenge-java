import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(); //a students number
            int k = in.nextInt(); //a min number of students on the lection's needed
            int a[] = new int[n];
            //students are coming
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0) k--;
                //System.out.println("a[a_i] is " + a[a_i]);
            }
            //System.out.println("k is " + k);
            if (k > 0) System.out.println("YES");//it's NOT enough students for lection
            else System.out.println("NO");//it's  enough students for lection
        }
    }
}
